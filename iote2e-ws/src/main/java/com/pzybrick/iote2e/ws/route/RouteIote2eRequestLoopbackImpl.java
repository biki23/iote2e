package com.pzybrick.iote2e.ws.route;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import org.apache.avro.util.Utf8;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pzybrick.iote2e.common.config.MasterConfig;
import com.pzybrick.iote2e.common.utils.Iote2eUtils;
import com.pzybrick.iote2e.schema.avro.Iote2eRequest;
import com.pzybrick.iote2e.schema.avro.Iote2eResult;
import com.pzybrick.iote2e.schema.avro.OPERATION;
import com.pzybrick.iote2e.schema.util.Iote2eSchemaConstants;
import com.pzybrick.iote2e.ws.socket.ThreadEntryPointIote2eRequest;


public class RouteIote2eRequestLoopbackImpl implements RouteIote2eRequest {
	private static final Logger logger = LogManager.getLogger(RouteIote2eRequestLoopbackImpl.class);
	private MasterConfig masterConfig;
	
	
	@Override
	public void init(MasterConfig masterConfig) throws Exception {
		this.masterConfig = masterConfig;
	}
	
	
	public void routeToTarget( Iote2eRequest iote2eRequest ) throws Exception {
		logger.debug(iote2eRequest.toString());
		String actuatorValue = "testActuatorValuea";
		CharSequence sensorName = null;
		if( !iote2eRequest.getPairs().values().isEmpty()) {
			Iterator<Map.Entry<CharSequence, CharSequence>> it = iote2eRequest.getPairs().entrySet().iterator();
			Map.Entry<CharSequence, CharSequence> entry = it.next();
			sensorName = entry.getKey();
			String sensorValue = entry.getValue().toString();
			actuatorValue = actuatorValue + sensorValue;
		}
		Map<CharSequence,CharSequence> pairs = new HashMap<CharSequence,CharSequence>();
		pairs.put( new Utf8(Iote2eSchemaConstants.PAIRNAME_SENSOR_NAME), sensorName );
		pairs.put( new Utf8(Iote2eSchemaConstants.PAIRNAME_ACTUATOR_NAME), new Utf8("testActuatorNamea"));
		pairs.put( new Utf8(Iote2eSchemaConstants.PAIRNAME_ACTUATOR_VALUE), new Utf8("testActuatorValuea"));
		pairs.put( new Utf8(Iote2eSchemaConstants.PAIRNAME_ACTUATOR_VALUE_UPDATED_AT), new Utf8(Iote2eUtils.getDateNowUtc8601()));

		
		String resultTimestamp = Iote2eUtils.getDateNowUtc8601();
		String resultUuid = UUID.randomUUID().toString();
		Iote2eResult iote2eResult = Iote2eResult.newBuilder()
				.setLoginName(iote2eRequest.getLoginName())
				.setSourceName(iote2eRequest.getSourceName())
				.setSourceType(iote2eRequest.getSourceType())
				.setRequestUuid(iote2eRequest.getRequestUuid())
				.setRequestTimestamp(iote2eRequest.getRequestTimestamp())
				.setOperation(OPERATION.ACTUATOR_VALUES)
				.setResultCode(0)
				.setResultUuid(resultUuid)
				.setResultTimestamp(resultTimestamp)
				.setPairs(pairs)
				.build();
		ThreadEntryPointIote2eRequest.toClientIote2eResults.add(iote2eResult);
	}

}
