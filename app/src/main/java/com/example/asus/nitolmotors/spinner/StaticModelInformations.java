package com.example.asus.nitolmotors.spinner;

import java.util.ArrayList;
import java.util.List;


public class StaticModelInformations {
    private static StaticModelInformations instance = null;

    private StaticModelInformations(){ }
    private static List<Model_Cars> mStaticDistrictInformation = new ArrayList<>();







    private static final String[] districtBanglaName = { "LPK 2518/38 TIPPER (16 CU.M.)", "LPK1618 TIPPER(10 CU.M)", "LPT 2518/48 BSIII", "LPT 2516 TC CAB (6X4)", "LPT 1615/52 TC SLPR CAB", "LPT 1615/48 TC SLPR CAB",
            "LPS 4018 TC PRIME MOVER", "PRIMA LPK 2523 TIPPER 16 CU.M", "PRIMA LX 4023 PRIME MOVER","PRIMA LX 4923,S PRIME MOVER","SE 1613/42 CABIN","LPK 909/27 TIPPER (PSTG)","LPT 912/43 ULTRA","LPT 1109/48 H.EX2 CAB BSIII","JAMUNA SPECIAL ",
            "LPT 1109/42 H.EX2 CAB BSIII","LPT 1109/36 H.EX2 CAB BSIII","LPT 1109/42 EX2 CAB (PSTG)",
            "LPT 1109/36 EX CAB (PSTG)","LPT 1109/36 CAB (MSTG)","LPT 909/38 H.EX2 BSIII (3 Ton)", "LPT 909/34 H.EX2 BSIII (3 Ton)","LPT 812/39 ULTRA","LPT 810/38 H EX2 BSIII","LPT 709/38 EX2 CAB (PSTG)","LPT 709/34 EX CAB (PSTG)", "SFC 709/38 EX CAB (PSTG)","LPT 407/27 EX CAB TT (PSTG)","SFC 407/31 TT.EX.CAB (PSTG)","SFC 407/29 CAB CHASSIS BSIII",
            "LP 909 AC BUS",
            "LPO 1316/55 BUS CHASSIS","LPO 1618/58 CWL BUS CHASSIS", "LPO 1512/55 TC CWL BUS CHESSIS","LPO 1512/47 TC CWL BUS CHASSIS","TATA ACE HT2 DIESEL PICK-UP" ,
            "LP 909/49 BUS CHASSIS","LP 709/42 CWL M.BUS (PSTG)","XENON XLT","207 DI EX SC FLAT BAD","207 DI RX","TATA ACE EX2","ACE SUPER (NON AC)", "TATA SAATHI-CHASSIS",
            "TATA SAATHI-HARD TOP", "TATA SAATHI -DELUX"
    };





    public static synchronized StaticModelInformations getInstance() {

        if (instance == null)

            instance = new StaticModelInformations();

        return instance;

    }

    public static List<Model_Cars> getStaticDistricts() {
        if (mStaticDistrictInformation != null) {
            mStaticDistrictInformation.clear();
        }

        for (int index=0;index<districtBanglaName.length;) {
            mStaticDistrictInformation.add(index, new Model_Cars(districtBanglaName[index]));
            index++;
        }
        return mStaticDistrictInformation;
    }
}
