package com.crab.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "animal")
public class AnimalProperties {
    private final Fish fish = new Fish();
    private final bird bird = new bird();
    private String type = "animal";
    private String name;

    public static class Fish {
        private String doing;

        public String getDoing() {
            return doing;
        }

        public void setDoing(String doing) {
            this.doing = doing;
        }
    }

    public static class bird {
        private String doing;

        public String getDoing() {
            return doing;
        }

        public void setDoing(String doing) {
            this.doing = doing;
        }
    }

}