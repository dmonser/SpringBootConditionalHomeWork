package ru.netollogy.springStartHomeWork.service;

public class ProductionProfile implements SystemProfile{
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
