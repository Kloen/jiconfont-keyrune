package jiconfont.icons.keyrune;

import jiconfont.IconCode;
import jiconfont.IconFont;

import java.io.InputStream;

/**
 * Copyright (c) 2018 KloenLansfiel <BR>
 * <BR>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:<BR>
 * <BR>
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.<BR>
 * <BR>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public enum Keyrune implements IconCode {
    LEA('\uE600'),
    LEB('\uE601'),
    _2ED('\uE602'),
    _3ED('\uE603'),
    _4ED('\uE604'),
    PSUM('\uE605'),
    _5ED('\uE606'),
    _6ED('\uE607'),
    _7ED('\uE608'),
    _8ED('\uE609'),
    _9ED('\uE60A'),
    _10E('\uE60B'),
    M10('\uE60C'),
    M11('\uE60D'),
    M12('\uE60E'),
    M13('\uE60F'),
    M14('\uE610'),
    M15('\uE611'),
    BCORE('\uE612'),
    ORI('\uE697'),
    M19('\uE941'),
    _1E('\uE947'),
    _2E('\uE948'),
    _2U('\uE949'),
    _3E('\uE94A'),

    /**
     * EXPANSIONS
     */
    /* ARTIFACT BLOCK */
    ARN('\uE613'),
    ATQ('\uE614'),
    LEG('\uE615'),

    /* WIZARDS BLOCK */
    DRK('\uE616'),
    FEM('\uE617'),
    HML('\uE618'),

    /* ICE AGE BLOCK */
    ICE('\uE619'),
    ICE2('\uE925'),
    ALL('\uE61A'),
    CSP('\uE61B'),

    /* MIRAGE BLOCK */
    MIR('\uE61C'),
    VIS('\uE61D'),
    WTH('\uE61E'),

    /* TEMPEST BLOCK */
    TMP('\uE61F'),
    STH('\uE620'),
    EXO('\uE621'),

    /* URZA'S BLOCK */
    USG('\uE622'),
    ULG('\uE623'),
    UDS('\uE624'),

    /* MERCADIAN BLOCK */
    MMQ('\uE625'),
    NEM('\uE626'),
    NMS('\uE626'),
    PCY('\uE627'),

    /* INVASION BLOCK */
    INV('\uE628'),
    PLS('\uE629'),
    APC('\uE62A'),

    /* ODYSSEY BLOCK */
    ODY('\uE62B'),
    TOR('\uE62C'),
    JUD('\uE62D'),

    /* ONSLAUGHT BLOCK */
    ONS('\uE62E'),
    LGN('\uE62F'),
    SCG('\uE630'),

    /* MIRRODIN BLOCK */
    MRD('\uE631'),
    DST('\uE632'),
    _5DN('\uE633'),

    /* KAMIGAWA BLOCK */
    CHK('\uE634'),
    BOK('\uE635'),
    SOK('\uE636'),

    /* RAVNICA BLOCK */
    RAV('\uE637'),
    GPT('\uE638'),
    DIS('\uE639'),

    /* TIME SPIRAL BLOCK */
    TSP('\uE63A'),
    PLC('\uE63B'),
    FUT('\uE63C'),

    /* LORWYN BLOCK */
    LRW('\uE63D'),
    MOR('\uE63E'),

    /* SHADOWMOOR BLOCK */
    SHM('\uE63F'),
    EVE('\uE640'),

    /* ALARA BLOCK */
    ALA('\uE641'),
    CON('\uE642'),
    ARB('\uE643'),

    /* ZENDIKAR BLOCK */
    ZEN('\uE644'),
    WWK('\uE645'),
    ROE('\uE646'),

    /* SCARS BLOCK */
    SOM('\uE647'),
    MBS('\uE648'),
    NPH('\uE649'),

    /* INNISTRAD BLOCK */
    ISD('\uE64A'),
    DKA('\uE64B'),
    AVR('\uE64C'),

    /* RTR BLOCK */
    RTR('\uE64D'),
    GTC('\uE64E'),
    DGM('\uE64F'),

    /* THEROS BLOCK */
    THS('\uE650'),
    BNG('\uE651'),
    JOU('\uE652'),

    /* KHANS BLOCK */
    KTK('\uE653'),
    FRF('\uE654'),
    DTK('\uE693'),

    /* RETURN TO ZENDIKAR BLOCK */
    BFZ('\uE699'),
    OGW('\uE901'),

    /* RETURN TO INNISTRAD BLOCK */
    SOI('\uE902'),
    EMN('\uE90B'),

    /* KALADESH BLOCK */
    KLD('\uE90E'),
    AER('\uE90F'),

    /* AMONKHET BLOCK */
    AKH('\uE914'),
    HOU('\uE924'),

    /* IXALAN BLOCK */
    XLN('\uE92E'),
    RIX('\uE92F'),

    /* DOMINARIA BLOCK */
    DOM('\uE93F'),

    /* GUILDS OF RAVNICA BLOCK */
    GRN('\uE94B'),
    GK1('\uE94B'),
    RNA('\uE959'),

    /**
     * COMMAND ZONE
     */
    VAN('\uE655'),
    HOP('\uE656'),
    ARC('\uE657'),
    CMD('\uE658'),
    PC2('\uE659'),
    CM1('\uE65A'),
    C13('\uE65B'),
    CNS('\uE65C'),
    C14('\uE65D'),
    C15('\uE900'),
    CN2('\uE904'),
    C16('\uE910'),
    PCA('\uE911'),
    CMA('\uE916'),
    E01('\uE92D'),
    ANN('\uE92D'),
    E02('\uE931'),
    C17('\uE934'),
    CM2('\uE940'),
    BBD('\uE942'),
    C18('\uE946'),

    /**
     * REPRINT
     */
    CHR('\uE65E'),
    ATH('\uE65F'),
    BRB('\uE660'),
    BTD('\uE661'),
    DKM('\uE662'),
    MMA('\uE663'),
    MM2('\uE695'),
    EMA('\uE903'),
    MM3('\uE912'),
    XREN('\uE917'),
    XRIN('\uE918'),
    IMA('\uE935'),
    A25('\uE93D'),
    UMA('\uE958'),

    /**
     * BEGINNER
     */
    POR('\uE664'),
    P02('\uE665'),
    PO2('\uE665'),
    PTK('\uE666'),
    S99('\uE667'),
    S00('\uE668'),
    W16('\uE907'),
    W17('\uE923'),

    /**
     * DUEL DECKS
     */
    EVG('\uE669'),
    DD2('\uE66A'),
    DDC('\uE66B'),
    DDD('\uE66C'),
    DDE('\uE66D'),
    DDF('\uE66E'),
    DDG('\uE66F'),
    DDH('\uE670'),
    DDI('\uE671'),
    DDJ('\uE672'),
    DDK('\uE673'),
    DDL('\uE674'),
    DDM('\uE675'),
    DDN('\uE676'),
    DDO('\uE677'),
    DDP('\uE698'),
    DDQ('\uE908'),
    DDR('\uE90D'),
    TD2('\uE91C'),
    DDS('\uE921'),
    DDT('\uE933'),
    DDU('\uE93E'),

    /**
     * FROM THE VAULT
     */
    DRB('\uE678'),
    V09('\uE679'),
    V10('\uE67A'),
    V11('\uE67B'),
    V12('\uE67C'),
    V13('\uE67D'),
    V14('\uE67E'),
    V15('\uE905'),
    V16('\uE906'),
    V0X('\uE920'),
    V17('\uE939'),

    /**
     * PREMIUM DECK SERIES
     */
    H09('\uE67F'),
    PD2('\uE680'),
    PD3('\uE681'),
    MD1('\uE682'),

    /**
     * SIGNATURE SPELLBOOK
     */
    SS1('\uE944'),

    /**
     * GLOBAL SERIES
     */
    GS1('\uE945'),

    /**
     * GUILD KITS
     */
    AZORIUS('\uE94E'),
    BOROS('\uE94F'),
    DIMIR('\uE950'),
    GOLGARI('\uE951'),
    GRUUL('\uE952'),
    IZZET('\uE953'),
    ORZHOV('\uE954'),
    RAKDOS('\uE955'),
    SELESNYA('\uE956'),
    SIMIC('\uE957'),

    /**
     * OTHER SUPPLEMENTAL PRODUCTS
     */
    GNT('\uE94D'),

    /**
     * PROMOTIONAL
     */
    PGRU('\uE683'),
    PMTG1('\uE684'),
    PMTG2('\uE685'),
    PLEAF('\uE686'),
    PMEI('\uE687'),
    PARL('\uE688'),
    DPA('\uE689'),
    PBOOK('\uE68A'),
    PAST('\uE68B'),
    PARL2('\uE68C'),
    EXP('\uE69A'),
    PSALVAT05('\uE909'),
    PSALVAT11('\uE90A'),
    MPS('\uE913'),
    MP1('\uE913'),
    PXBOX('\uE915'),
    PMPS('\uE919'),
    PMPU('\uE91A'),
    MP2('\uE922'),
    PIDW('\uE92C'),
    PDRC('\uE932'),
    PHEART('\uE936'),
    H17('\uE938'),
    PDEP('\uE93A'),
    PSEGA('\uE93B'),
    PTSA('\uE93C'),
    PARL3('\uE943'),
    HTR('\uE687'),
    MED('\uE94C'),

    /**
     * ONLINE
     */
    ME1('\uE68D'),
    ME2('\uE68E'),
    ME3('\uE68F'),
    ME4('\uE690'),
    TPR('\uE694'),
    VMA('\uE696'),
    PZ1('\uE90C'),
    XLCU('\uE90C'),
    MODO('\uE91B'),
    PMODO('\uE91B'),
    DUELS('\uE91D'),
    XDUELS('\uE91D'),
    XMODS('\uE91E'),
    PZ2('\uE91F'),

    /**
     * UN-SERIOUS
     */
    UGL('\uE691'),
    UNH('\uE692'),
    UST('\uE930'),

    /**
     * UNOFFICIAL
     */
    XCLE('\uE926'),
    XICE('\uE927'),
    X2PS('\uE928'),
    X4EA('\uE929'),
    PAPAC('\uE92A'),
    PEURO('\uE92B'),
    PFNM('\uE937');


    private final char character;

    Keyrune(char character) {
        this.character = character;
    }

    @Override
    public char getUnicode() {
        return character;
    }

    @Override
    public String getFontFamily() {
        return "Keyrune";
    }

    public static IconFont getIconFont() {
        return new IconFont() {
            @Override
            public String getFontFamily() {
                return "Keyrune";
            }

            @Override
            public InputStream getFontInputStream() {
                return Keyrune.class.getResourceAsStream("/fonts/keyrune.ttf");
            }
        };
    }

}
