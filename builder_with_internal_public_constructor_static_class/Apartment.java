package designPatterns_github.designPatterns_github.builder_with_internal_public_constructor_static_class;

public class Apartment {
    // required
    private String townArea;
    private Boolean isFinished;
    private Integer noRooms;
    private Double price;
    private Integer level;

    // optional
    private PositionFinishedApartment positionEVSN;
    private Integer noBathrooms;
    private Integer noBalcony;

    public Apartment(ApartmentBuilder apartmentBuilder) {
        this.townArea = apartmentBuilder.townArea;
        this.isFinished = apartmentBuilder.isFinished;
        this.noRooms = apartmentBuilder.noRooms;
        this.price = apartmentBuilder.price;
        this.level = apartmentBuilder.level;
        this.positionEVSN = apartmentBuilder.positionEVSN;
        this.noBathrooms = apartmentBuilder.noBathrooms;
        this.noBalcony = apartmentBuilder.noBalcony;
    }

    public PositionFinishedApartment getIsFinished() {
        if (isFinished) {
            return PositionFinishedApartment.FINISHED;
        }
        return PositionFinishedApartment.NOT_FINISHED;
    }

    public Integer getNoBathrooms() {
        return noBathrooms;
    }

    public Integer getNoBalcony() {
        return noBalcony;
    }

    public String getTownArea() {
        return townArea;
    }

    public PositionFinishedApartment getPositionEVSN(PositionFinishedApartment positionEVSN) {
        PositionFinishedApartment positionFinishedApartment;
        switch (positionEVSN) {
            case EAST: positionFinishedApartment = PositionFinishedApartment.EAST; break;
            case WEST: positionFinishedApartment = PositionFinishedApartment.WEST; break;
            case SOUTH: positionFinishedApartment = PositionFinishedApartment.SOUTH; break;
            case NORTH: positionFinishedApartment = PositionFinishedApartment.NORTH; break;
            case NORTH_EAST: positionFinishedApartment = PositionFinishedApartment.NORTH_EAST; break;
            case NORTH_WEST: positionFinishedApartment = PositionFinishedApartment.NORTH_WEST; break;
            case SOUTH_EAST: positionFinishedApartment = PositionFinishedApartment.SOUTH_EAST; break;
            case SOUTH_WEST: positionFinishedApartment = PositionFinishedApartment.SOUTH_WEST; break;
            default:
                throw new IllegalStateException("Unexpected value: " + positionEVSN);
        }
        return positionFinishedApartment;
    }

    public PositionFinishedApartment getPositionEVSN2() {
        return this.positionEVSN;
    }

    public Integer getNoRooms() {
        return noRooms;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getLevel() {
        return level;
    }


    @Override
    public String toString() {
        return "Apartment{" +
                "townArea='" + townArea + '\'' +
                ", isFinished=" + isFinished +
                ", noRooms=" + noRooms +
                ", price=" + price +
                ", level=" + level +
                ", positionEVSN='" + positionEVSN + '\'' +
                ", noBathrooms=" + noBathrooms +
                ", noBalcony=" + noBalcony +
                '}';
    }

    public static class ApartmentBuilder {
        // required
        private String townArea;
        private Boolean isFinished;
        private Integer noRooms;
        private Double price;
        private Integer level;

        // optional
        private PositionFinishedApartment positionEVSN;
        private Integer noBathrooms;
        private Integer noBalcony;

        public ApartmentBuilder(String townArea, Boolean isFinished, Integer noRooms, Double price, Integer level) {
            this.townArea = townArea;
            this.isFinished = isFinished;
            this.noRooms = noRooms;
            this.price = price;
            this.level = level;
        }

        public ApartmentBuilder(Integer noRooms, Double price, Integer level, PositionFinishedApartment positionEVSN) {
            this.noRooms = noRooms;
            this.price = price;
            this.level = level;
            this.positionEVSN = positionEVSN;
        }

        public ApartmentBuilder withTownArea(String townArea) {
            this.townArea = townArea;
            return this;
        }

        public ApartmentBuilder withIsFinished(Boolean finished) {
            isFinished = finished;
            return this;
        }

        public ApartmentBuilder withPositionEVSN(PositionFinishedApartment positionEVSN) {
            this.positionEVSN = positionEVSN;
            return this;
        }

        public ApartmentBuilder withNoBathrooms(Integer noBathrooms) {
            this.noBathrooms = noBathrooms;
            return this;
        }

        public ApartmentBuilder withNoBalcony(Integer noBalcony) {
            this.noBalcony = noBalcony;
            return this;
        }

        public Apartment build() {
            return new Apartment(this);
        }
    }
}
