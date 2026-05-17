package center.jhub.data.dto.in.dev;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class RestOptionsInDTO {

    public static final String JSON_TYPE_PROPERTY = "__jh_type";
    public static final String JSON_MAX_PROPERTY = "__jh_max";
    public static final String JSON_MIN_PROPERTY = "__jh_min";
    public static final String JSON_LIST_PROPERTY = "__jh_list";
    public static final String JSON_VALUE_PROPERTY = "__jh_value";
    public static final String JSON_CAN_BE_NEGATIVE_PROPERTY = "__jh_can_be_negative";

    @JsonProperty(JSON_TYPE_PROPERTY)
    private FieldType type;

    @JsonProperty(JSON_MAX_PROPERTY)
    private Integer max;

    @JsonProperty(JSON_MIN_PROPERTY)
    private Integer min;

    @JsonProperty(JSON_CAN_BE_NEGATIVE_PROPERTY)
    private Boolean canBeNegative;

    @JsonProperty(JSON_VALUE_PROPERTY)
    private Object value;


    public enum FieldType {
        STRING,
        BOOLEAN,
        INTEGER,
        LONG,
        DECIMAL,
        CHARACTER,
        SHORT,

        LIST,
        ARRAY,

        OBJECT
    }
}
