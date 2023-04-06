package designPatterns_github.designPatterns_github.builder_with_Lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                   // generates getters, setters, toString, equals and hashCode methods
@NoArgsConstructor      // it generates a constructor without arguments - default
@AllArgsConstructor     // it generates a constructor with arguments for all the fields of the class
@Builder
public class LombokClass {
    private String perfumeName;
    private Integer perfumeQuantity;
    private String perfumeProducer;
    private Float perfumePrice;
}
