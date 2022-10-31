package org.springframework.music;

public class ClassicalMusic implements Music{
    private String classicMuse = "пам пам пИдам пам пам пидАм";

    @Override
    public String getSong() {
        return classicMuse;
    }
}
