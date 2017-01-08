package com.example.asus.nitolmotors.spinner;


public class Model_Cars {

    private int DistrictId;
    private String District;
    private String DistrictBng;
    private int DeliveryCharge;
    private byte IsAdvPaymentActive;

    public Model_Cars(int districtId, String district, String districtBng,
                      int deliveryCharge, Byte isAdvPaymentActive) {
        DistrictId = districtId;
        District = district;
        DistrictBng = districtBng;
        DeliveryCharge = deliveryCharge;
        IsAdvPaymentActive = isAdvPaymentActive;
    }

    public Model_Cars(String districtBng)
    {

        DistrictBng = districtBng;

    }
    public int getDistrictId() {
        return DistrictId;
    }

    public String getDistrict() {
        return District;
    }

    public String getDistrictBng() {
        return DistrictBng;
    }

    public int getDeliveryCharge() {
        return DeliveryCharge;
    }

    public byte getIsAdvPaymentActive() {
        return IsAdvPaymentActive;
    }

    @Override
    public String toString() {
        return "Model_Cars{" +
                "DistrictId=" + DistrictId +
                ", District='" + District + '\'' +
                ", DistrictBng='" + DistrictBng + '\'' +
                ", DeliveryCharge=" + DeliveryCharge +
                ", IsAdvPaymentActive=" + IsAdvPaymentActive +
                '}';
    }
}
