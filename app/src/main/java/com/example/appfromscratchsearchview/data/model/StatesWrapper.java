package com.example.appfromscratchsearchview.data.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class StatesWrapper {
    public final State AL;
    public final State AK;
    public final State AZ;
    public final State AR;
    public final State CA;
    public final State CO;
    public final State CT;
    public final State DE;
    public final State FL;
    public final State GA;
    public final State HI;
    public final State ID;
    public final State IL;
    public final State IN;
    public final State IA;
    public final State KS;
    public final State KY;
    public final State LA;
    public final State ME;
    public final State MD;
    public final State MA;
    public final State MI;
    public final State MN;
    public final State MS;
    public final State MO;
    public final State MT;
    public final State NE;
    public final State NV;
    public final State NH;
    public final State NJ;
    public final State NM;
    public final State NY;
    public final State NC;
    public final State ND;
    public final State OH;
    public final State OK;
    public final State OR;
    public final State PA;
    public final State RI;
    public final State SC;
    public final State SD;
    public final State TN;
    public final State TX;
    public final State UT;
    public final State VT;
    public final State VA;
    public final State WA;
    public final State WV;
    public final State WI;
    public final State WY;

    public StatesWrapper(State AL, State AK, State AZ, State AR, State CA, State CO, State CT, State DE, State FL, State GA, State HI, State ID, State IL, State IN, State IA, State KS, State KY, State LA, State ME, State MD, State MA, State MI, State MN, State MS, State MO, State MT, State NE, State NV, State NH, State NJ, State NM, State NY, State NC, State ND, State OH, State OK, State OR, State PA, State RI, State SC, State SD, State TN, State TX, State UT, State VT, State VA, State WA, State WV, State WI, State WY) {
        this.AL = AL;
        this.AK = AK;
        this.AZ = AZ;
        this.AR = AR;
        this.CA = CA;
        this.CO = CO;
        this.CT = CT;
        this.DE = DE;
        this.FL = FL;
        this.GA = GA;
        this.HI = HI;
        this.ID = ID;
        this.IL = IL;
        this.IN = IN;
        this.IA = IA;
        this.KS = KS;
        this.KY = KY;
        this.LA = LA;
        this.ME = ME;
        this.MD = MD;
        this.MA = MA;
        this.MI = MI;
        this.MN = MN;
        this.MS = MS;
        this.MO = MO;
        this.MT = MT;
        this.NE = NE;
        this.NV = NV;
        this.NH = NH;
        this.NJ = NJ;
        this.NM = NM;
        this.NY = NY;
        this.NC = NC;
        this.ND = ND;
        this.OH = OH;
        this.OK = OK;
        this.OR = OR;
        this.PA = PA;
        this.RI = RI;
        this.SC = SC;
        this.SD = SD;
        this.TN = TN;
        this.TX = TX;
        this.UT = UT;
        this.VT = VT;
        this.VA = VA;
        this.WA = WA;
        this.WV = WV;
        this.WI = WI;
        this.WY = WY;
    }

    public List<State> getAllStates() {
        return new ArrayList<>(
                Arrays.asList(AL, AK, AZ, AR, CA, CO, CT, DE, FL, GA, HI, ID, IL, IN, IA, KS, KY, LA, ME, MD, MA, MI, MN, MS, MO, MT, NE, NV, NH, NJ, NM, NY, NC, ND, OH, OK, OR, PA, RI, SC, SD, TN, TX, UT, VT, VA, WA, WV, WI, WY)
        );
    }
}
