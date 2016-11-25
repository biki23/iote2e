/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pzybrick.iote2e.schema.avro;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LoginSourceSensorValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1460484278144048320L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LoginSourceSensorValue\",\"namespace\":\"com.pzybrick.iote2e.schema.avro\",\"fields\":[{\"name\":\"login_uuid\",\"type\":\"string\"},{\"name\":\"source_uuid\",\"type\":\"string\"},{\"name\":\"sensor_name\",\"type\":\"string\"},{\"name\":\"sensor_value\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence login_uuid;
  @Deprecated public java.lang.CharSequence source_uuid;
  @Deprecated public java.lang.CharSequence sensor_name;
  @Deprecated public java.lang.CharSequence sensor_value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LoginSourceSensorValue() {}

  /**
   * All-args constructor.
   * @param login_uuid The new value for login_uuid
   * @param source_uuid The new value for source_uuid
   * @param sensor_name The new value for sensor_name
   * @param sensor_value The new value for sensor_value
   */
  public LoginSourceSensorValue(java.lang.CharSequence login_uuid, java.lang.CharSequence source_uuid, java.lang.CharSequence sensor_name, java.lang.CharSequence sensor_value) {
    this.login_uuid = login_uuid;
    this.source_uuid = source_uuid;
    this.sensor_name = sensor_name;
    this.sensor_value = sensor_value;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return login_uuid;
    case 1: return source_uuid;
    case 2: return sensor_name;
    case 3: return sensor_value;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: login_uuid = (java.lang.CharSequence)value$; break;
    case 1: source_uuid = (java.lang.CharSequence)value$; break;
    case 2: sensor_name = (java.lang.CharSequence)value$; break;
    case 3: sensor_value = (java.lang.CharSequence)value$; break;
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
   * Gets the value of the 'sensor_name' field.
   * @return The value of the 'sensor_name' field.
   */
  public java.lang.CharSequence getSensorName() {
    return sensor_name;
  }

  /**
   * Sets the value of the 'sensor_name' field.
   * @param value the value to set.
   */
  public void setSensorName(java.lang.CharSequence value) {
    this.sensor_name = value;
  }

  /**
   * Gets the value of the 'sensor_value' field.
   * @return The value of the 'sensor_value' field.
   */
  public java.lang.CharSequence getSensorValue() {
    return sensor_value;
  }

  /**
   * Sets the value of the 'sensor_value' field.
   * @param value the value to set.
   */
  public void setSensorValue(java.lang.CharSequence value) {
    this.sensor_value = value;
  }

  /**
   * Creates a new LoginSourceSensorValue RecordBuilder.
   * @return A new LoginSourceSensorValue RecordBuilder
   */
  public static com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder newBuilder() {
    return new com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder();
  }

  /**
   * Creates a new LoginSourceSensorValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LoginSourceSensorValue RecordBuilder
   */
  public static com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder newBuilder(com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder other) {
    return new com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder(other);
  }

  /**
   * Creates a new LoginSourceSensorValue RecordBuilder by copying an existing LoginSourceSensorValue instance.
   * @param other The existing instance to copy.
   * @return A new LoginSourceSensorValue RecordBuilder
   */
  public static com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder newBuilder(com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue other) {
    return new com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder(other);
  }

  /**
   * RecordBuilder for LoginSourceSensorValue instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LoginSourceSensorValue>
    implements org.apache.avro.data.RecordBuilder<LoginSourceSensorValue> {

    private java.lang.CharSequence login_uuid;
    private java.lang.CharSequence source_uuid;
    private java.lang.CharSequence sensor_name;
    private java.lang.CharSequence sensor_value;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.login_uuid)) {
        this.login_uuid = data().deepCopy(fields()[0].schema(), other.login_uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.source_uuid)) {
        this.source_uuid = data().deepCopy(fields()[1].schema(), other.source_uuid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sensor_name)) {
        this.sensor_name = data().deepCopy(fields()[2].schema(), other.sensor_name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.sensor_value)) {
        this.sensor_value = data().deepCopy(fields()[3].schema(), other.sensor_value);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing LoginSourceSensorValue instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.login_uuid)) {
        this.login_uuid = data().deepCopy(fields()[0].schema(), other.login_uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.source_uuid)) {
        this.source_uuid = data().deepCopy(fields()[1].schema(), other.source_uuid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sensor_name)) {
        this.sensor_name = data().deepCopy(fields()[2].schema(), other.sensor_name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.sensor_value)) {
        this.sensor_value = data().deepCopy(fields()[3].schema(), other.sensor_value);
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
    public com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder setLoginUuid(java.lang.CharSequence value) {
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
    public com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder clearLoginUuid() {
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
    public com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder setSourceUuid(java.lang.CharSequence value) {
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
    public com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder clearSourceUuid() {
      source_uuid = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'sensor_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getSensorName() {
      return sensor_name;
    }

    /**
      * Sets the value of the 'sensor_name' field.
      * @param value The value of 'sensor_name'.
      * @return This builder.
      */
    public com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder setSensorName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.sensor_name = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'sensor_name' field has been set.
      * @return True if the 'sensor_name' field has been set, false otherwise.
      */
    public boolean hasSensorName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'sensor_name' field.
      * @return This builder.
      */
    public com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder clearSensorName() {
      sensor_name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'sensor_value' field.
      * @return The value.
      */
    public java.lang.CharSequence getSensorValue() {
      return sensor_value;
    }

    /**
      * Sets the value of the 'sensor_value' field.
      * @param value The value of 'sensor_value'.
      * @return This builder.
      */
    public com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder setSensorValue(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.sensor_value = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'sensor_value' field has been set.
      * @return True if the 'sensor_value' field has been set, false otherwise.
      */
    public boolean hasSensorValue() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'sensor_value' field.
      * @return This builder.
      */
    public com.pzybrick.iote2e.schema.avro.LoginSourceSensorValue.Builder clearSensorValue() {
      sensor_value = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public LoginSourceSensorValue build() {
      try {
        LoginSourceSensorValue record = new LoginSourceSensorValue();
        record.login_uuid = fieldSetFlags()[0] ? this.login_uuid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.source_uuid = fieldSetFlags()[1] ? this.source_uuid : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.sensor_name = fieldSetFlags()[2] ? this.sensor_name : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.sensor_value = fieldSetFlags()[3] ? this.sensor_value : (java.lang.CharSequence) defaultValue(fields()[3]);
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
