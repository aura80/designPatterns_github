package designPatterns_github.designPatterns_github.builder_with_internal_default_constructor_static_class;

import java.util.List;

public class House {
    private Integer bricksNo;
    private Integer tilesNo;
    private Double cementKg;
    private Double paintKg;
    private String paintColor;
    private Integer doorsNo;
    private Integer windowsNo;
    private List<String> workers;
    private Double salary;
    private List<Boolean> worksOnWeekend;
    private Double bonus;

    private House(Integer bricksNo, Integer tilesNo, Double cementKg, Double paintKg, String paintColor, Integer doorsNo,
                 Integer windowsNo, List<String> workers, Double salary, List<Boolean> worksOnWeekend, Double bonus) {
        this.bricksNo = bricksNo;
        this.tilesNo = tilesNo;
        this.cementKg = cementKg;
        this.paintKg = paintKg;
        this.paintColor = paintColor;
        this.doorsNo = doorsNo;
        this.windowsNo = windowsNo;
        this.workers = workers;
        this.salary = salary;
        this.worksOnWeekend = worksOnWeekend;
        this.bonus = bonus;
    }

    public Integer getBricksNo() {
        return bricksNo;
    }

    public void setBricksNo(Integer bricksNo) {
        this.bricksNo = bricksNo;
    }

    public Integer getTilesNo() {
        return tilesNo;
    }

    public void setTilesNo(Integer tilesNo) {
        this.tilesNo = tilesNo;
    }

    public Double getCementKg() {
        return cementKg;
    }

    public void setCementKg(Double cementKg) {
        this.cementKg = cementKg;
    }

    public Double getPaintKg() {
        return paintKg;
    }

    public void setPaintKg(Double paintKg) {
        this.paintKg = paintKg;
    }

    public String getPaintColor() {
        return paintColor;
    }

    public void setPaintColor(String paintColor) {
        this.paintColor = paintColor;
    }

    public Integer getDoorsNo() {
        return doorsNo;
    }

    public void setDoorsNo(Integer doorsNo) {
        this.doorsNo = doorsNo;
    }

    public Integer getWindowsNo() {
        return windowsNo;
    }

    public void setWindowsNo(Integer windowsNo) {
        this.windowsNo = windowsNo;
    }

    public List<String> getWorkers() {
        return workers;
    }

    public void setWorkers(List<String> workers) {
        this.workers = workers;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Boolean> getWorksOnWeekend() {
        return worksOnWeekend;
    }

    public void setWorksOnWeekend(List<Boolean> worksOnWeekend) {
        this.worksOnWeekend = worksOnWeekend;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("House{").append("bricksNo=").append(bricksNo).append(", tilesNo=").append(tilesNo)
                .append(", cementKg=").append(cementKg).append(", paintKg=").append(paintKg).append(", paintColor='")
                .append(paintColor).append('\'').append(", doorsNo=").append(doorsNo).append(", windowsNo=")
                .append(windowsNo).append(", workers=").append(workers).append(", salary=").append(salary)
                .append(", worksOnWeekend=").append(worksOnWeekend).append(", bonus=").append(bonus)
                .append('}');

        return stringBuilder.toString();
    }

    public static class HouseBuilder {
        private Integer bricksNo;
        private Integer tilesNo;
        private Double cementKg;
        private Double paintKg;
        private String paintColor;
        private Integer doorsNo;
        private Integer windowsNo;
        private List<String> workers;
        private Double salary;
        private List<Boolean> worksOnWeekend;
        private Double bonus;

        // configuring methods
        public HouseBuilder withBricksNo(final Integer bricksNo) {
            this.bricksNo = bricksNo;
            return this;
        }

        public HouseBuilder withTilesNo(final Integer tilesNo) {
            this.tilesNo = tilesNo;
            return this;
        }

        public HouseBuilder withCementKg(final Double cementKg) {
            this.cementKg = cementKg;
            return this;
        }

        public HouseBuilder withPaintKg(final Double paintKg) {
            this.paintKg = paintKg;
            return this;
        }

        public HouseBuilder withPaintColor(final String paintColor) {
            this.paintColor = paintColor;
            return this;
        }

        public HouseBuilder withDoorsNo(final Integer doorsNo) {
            this.doorsNo = doorsNo;
            return this;
        }

        public HouseBuilder withWindowsNo(final Integer windowsNo) {
            this.windowsNo = windowsNo;
            return this;
        }

        public HouseBuilder withWorkers(final List<String> workers) {
            this.workers = workers;
            return this;
        }

        public HouseBuilder withSalary(final Double salary) {
            this.salary = salary;
            return this;
        }

        public HouseBuilder withWorksOnWeekend(final List<Boolean> worksOnWeekend) {
            this.worksOnWeekend = worksOnWeekend;
            return this;
        }

        public HouseBuilder withBonus(final Double bonus) {
            this.bonus = bonus;
            return this;
        }

        // creates the target object
        public House build() {
            return new House(bricksNo, tilesNo, cementKg, paintKg, paintColor, doorsNo, windowsNo, workers, salary,
                    worksOnWeekend, bonus);
        }
    }
}
