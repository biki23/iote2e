#!/bin/bash
./run-junit-tests-common.sh TestCommonLocalhost.properties TestKsiHandler.properties \
../target/iote2e-tests-1.0.0.jar \
"com.pzybrick.test.iote2e.ruleproc.ksi.TestKsiHandlerTempToFan"

./run-junit-tests-common.sh TestCommonLocalhost.properties TestKsiHandler.properties \
../target/iote2e-tests-1.0.0.jar \
"com.pzybrick.test.iote2e.ruleproc.ksi.TestKsiHandlerHumidityToMister"

./run-junit-tests-common.sh TestCommonLocalhost.properties TestKsiHandler.properties \
../target/iote2e-tests-1.0.0.jar \
"com.pzybrick.test.iote2e.ruleproc.ksi.TestKsiHandlerLed"
