package designPatterns_github.designPatterns_github.builder_with_Lombok;

public class LombokClassBuilder {
    public static void main(String[] args) {
        LombokClass perfumeByzance = new LombokClass.LombokClassBuilder().perfumeName("Byzance")
                .perfumeQuantity(90).perfumeProducer("Rochas").perfumePrice(320.9f).build();
        System.out.println(perfumeByzance);

        LombokClass perfumeVersacery = new LombokClass.LombokClassBuilder().perfumeName("Versacery")
                .perfumeQuantity(50).perfumeProducer("Versace").perfumePrice(280.5f).build();
        System.out.println(perfumeVersacery);
    }
}
