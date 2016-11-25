/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pzybrick.iote2e.schema.avro;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LoginSourceRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5235507422626200104L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LoginSourceRequest\",\"namespace\":\"com.pzybrick.iote2e.schema.avro\",\"fields\":[{\"name\":\"login_uuid\",\"type\":\"string\"},{\"name\":\"source_uuid\",\"type\":\"string\"},{\"name\":\"timestamp\",\"type\":\"string\"},{\"name\":\"sensorValues\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SensorValue\",\"fields\":[{\"name\":\"sensor_name\",\"type\":\"string\"},{\"name\":\"sensor_value\",\"type\":\"string\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence login_uuid;
  @Deprecated public java.lang.CharSequence source_uuid;
  @Deprecated public java.lang.CharSequence timestamp;
  @Deprecated public java.util.List<com.pzybrick.iote2e.schema.avro.SensorValue> sensorValues;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LoginSourceRequest() {}

  /**
   * All-args constructor.
   * @param login_uuid The new value for login_uuid
   * @param source_uuid The new value for source_uuid
   * @param timestamp The new value for timestamp
   * @param sensorValues The new value for sensorValues
   */
  public LoginSourceRequest(java.lang.CharSequence login_uuid, java.lang.CharSequence source_uuid, java.lang.CharSequence timestamp, java.util.List<com.pzybrick.iote2e.schema.avro.SensorValue> sensorValues) {
    this.login_uuid = login_uuid;
    this.source_uuid = source_uuid;
    this.timestamp = timestamp;
    this.sensorValues = sensorValues;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return login_uuid;
    case 1: return source_uuid;
    case 2: return timestamp;
    case 3: return sensorValues;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: login_uuid = (java.lang.CharSequence)value$; break;
    case 1: source_uuid = (java.lang.CharSequence)value$; break;
    case 2: timestamp = (java.lang.CharSequence)value$; break;
    case 3: sensorValues = (java.util.List<com.pzybrick.iote2e.schema.avro.SensorValue>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'login_uuid' field.
   * @return The value of the 'login_uuid' field.
   */
  public java.lang.CharSequence getLoginUuid() {
    return login_uuid;
  }

  /**
   * Sets the value of the 'login_uuid' field.
   * @param value the value to set.
   */
  public void setLoginUuid(java.lang.CharSequence value) {
    this.login_uuid = value;
  }

  /**
   * Gets the value of the 'source_uuid' field.
   * @return The value of the 'source_uuid' field.
   */
  public java.lang.CharSequence getSourceUuid() {
    return source_uuid;
  }

  /**
   * Sets the value of the 'source_uuid' field.
   * @param value the value to set.
   */
  public void setSourceUuid(java.lang.CharSequence value) {
    this.source_uuid = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.CharSequence getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.CharSequence value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'sensorValues' field.
   * @return The value of the 'sensorValues' field.
   */
  public java.util.List<com.pzybrick.iote2e.schema.avro.SensorValue> getSensorValues() {
    return sensorValues;
  }

  /**
   * Sets the value of the 'sensorValues' field.
   * @param value the value to set.
   */
  public void setSensorValues(java.util.List<com.pzybrick.iote2e.schema.avro.SensorValue> value) {
    this.sensorValues = value;
  }

  /**
   * Creates a new LoginSourceRequest RecordBuilder.
   * @return A new LoginSourceRequest RecordBuilder
   */
  public static com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder newBuilder() {
    return new com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder();
  }

  /**
   * Creates a new LoginSourceRequest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LoginSourceRequest RecordBuilder
   */
  public static com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder newBuilder(com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder other) {
    return new com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder(other);
  }

  /**
   * Creates a new LoginSourceRequest RecordBuilder by copying an existing LoginSourceRequest instance.
   * @param other The existing instance to copy.
   * @return A new LoginSourceRequest RecordBuilder
   */
  public static com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder newBuilder(com.pzybrick.iote2e.schema.avro.LoginSourceRequest other) {
    return new com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder(other);
  }

  /**
   * RecordBuilder for LoginSourceRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LoginSourceRequest>
    implements org.apache.avro.data.RecordBuilder<LoginSourceRequest> {

    private java.lang.CharSequence login_uuid;
    private java.lang.CharSequence source_uuid;
    private java.lang.CharSequence timestamp;
    private java.util.List<com.pzybrick.iote2e.schema.avro.SensorValue> sensorValues;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.login_uuid)) {
        this.login_uuid = data().deepCopy(fields()[0].schema(), other.login_uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.source_uuid)) {
        this.source_uuid = data().deepCopy(fields()[1].schema(), other.source_uuid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.sensorValues)) {
        this.sensorValues = data().deepCopy(fields()[3].schema(), other.sensorValues);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing LoginSourceRequest instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pzybrick.iote2e.schema.avro.LoginSourceRequest other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.login_uuid)) {
        this.login_uuid = data().deepCopy(fields()[0].schema(), other.login_uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.source_uuid)) {
        this.source_uuid = data().deepCopy(fields()[1].schema(), other.source_uuid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.sensorValues)) {
        this.sensorValues = data().deepCopy(fields()[3].schema(), other.sensorValues);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'login_uuid' field.
      * @return The value.
      */
    public java.lang.CharSequence getLoginUuid() {
      return login_uuid;
    }

    /**
      * Sets the value of the 'login_uuid' field.
      * @param value The value of 'login_uuid'.
      * @return This builder.
      */
    public com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder setLoginUuid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.login_uuid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'login_uuid' field has been set.
      * @return True if the 'login_uuid' field has been set, false otherwise.
      */
    public boolean hasLoginUuid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'login_uuid' field.
      * @return This builder.
      */
    public com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder clearLoginUuid() {
      login_uuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'source_uuid' field.
      * @return The value.
      */
    public java.lang.CharSequence getSourceUuid() {
      return source_uuid;
    }

    /**
      * Sets the value of the 'source_uuid' field.
      * @param value The value of 'source_uuid'.
      * @return This builder.
      */
    public com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder setSourceUuid(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.source_uuid = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'source_uuid' field has been set.
      * @return True if the 'source_uuid' field has been set, false otherwise.
      */
    public boolean hasSourceUuid() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'source_uuid' field.
      * @return This builder.
      */
    public com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder clearSourceUuid() {
      source_uuid = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.CharSequence getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder setTimestamp(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'sensorValues' field.
      * @return The value.
      */
    public java.util.List<com.pzybrick.iote2e.schema.avro.SensorValue> getSensorValues() {
      return sensorValues;
    }

    /**
      * Sets the value of the 'sensorValues' field.
      * @param value The value of 'sensorValues'.
      * @return This builder.
      */
    public com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder setSensorValues(java.util.List<com.pzybrick.iote2e.schema.avro.SensorValue> value) {
      validate(fields()[3], value);
      this.sensorValues = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'sensorValues' field has been set.
      * @return True if the 'sensorValues' field has been set, false otherwise.
      */
    public boolean hasSensorValues() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'sensorValues' field.
      * @return This builder.
      */
    public com.pzybrick.iote2e.schema.avro.LoginSourceRequest.Builder clearSensorValues() {
      sensorValues = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public LoginSourceRequest build() {
      try {
        LoginSourceRequest record = new LoginSourceRequest();
        record.login_uuid = fieldSetFlags()[0] ? this.login_uuid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.source_uuid = fieldSetFlags()[1] ? this.source_uuid : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.sensorValues = fieldSetFlags()[3] ? this.sensorValues : (java.util.List<com.pzybrick.iote2e.schema.avro.SensorValue>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
