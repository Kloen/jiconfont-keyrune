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
    /**
     * Core Sets
     */
    LEA('\uE600'),
    _1E('\uE947'),
    LEB('\uE601'),
    _2E('\uE948'),
    _2ED('\uE602'),
    _2U('\uE949'),
    _3ED('\uE603'),
    _3E('\uE94A'),
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
    M20('\uE95D'),
    M21('\uE960'),
    XDND('\uE972'),

    /**
     * Expansion Sets
     */
    ARN('\uE613'),
    ATQ('\uE614'),
    LEG('\uE615'),
    DRK('\uE616'),
    FEM('\uE617'),
    HML('\uE618'),
    ICE('\uE619'),
    ICE2('\uE925'),
    ALL('\uE61A'),
    CSP('\uE61B'),
    MIR('\uE61C'),
    VIS('\uE61D'),
    WTH('\uE61E'),
    TMP('\uE61F'),
    STH('\uE620'),
    EXO('\uE621'),
    USG('\uE622'),
    ULG('\uE623'),
    UDS('\uE624'),
    MMQ('\uE625'),
    NEM('\uE626'),
    PCY('\uE627'),
    INV('\uE628'),
    PLS('\uE629'),
    APC('\uE62A'),
    ODY('\uE62B'),
    TOR('\uE62C'),
    JUD('\uE62D'),
    ONS('\uE62E'),
    LGN('\uE62F'),
    SCG('\uE630'),
    MRD('\uE631'),
    DST('\uE632'),
    _5DN('\uE633'),
    CHK('\uE634'),
    BOK('\uE635'),
    SOK('\uE636'),
    RAV('\uE637'),
    GPT('\uE638'),
    DIS('\uE639'),
    TSP('\uE63A'),
    PLC('\uE63B'),
    FUT('\uE63C'),
    LRW('\uE63D'),
    MOR('\uE63E'),
    SHM('\uE63F'),
    EVE('\uE640'),
    ALA('\uE641'),
    CON('\uE642'),
    ARB('\uE643'),
    ZEN('\uE644'),
    WWK('\uE645'),
    ROE('\uE646'),
    SOM('\uE647'),
    MBS('\uE648'),
    NPH('\uE649'),
    ISD('\uE64A'),
    DKA('\uE64B'),
    AVR('\uE64C'),
    RTR('\uE64D'),
    GTC('\uE64E'),
    DGM('\uE64F'),
    THS('\uE650'),
    BNG('\uE651'),
    JOU('\uE652'),
    KTK('\uE653'),
    FRF('\uE654'),
    DTK('\uE693'),
    BFZ('\uE699'),
    OGW('\uE901'),
    SOI('\uE902'),
    EMN('\uE90B'),
    KLD('\uE90E'),
    AER('\uE90F'),
    AKH('\uE914'),
    HOU('\uE924'),
    XLN('\uE92E'),
    RIX('\uE92F'),
    DOM('\uE93F'),
    GRN('\uE94B'),
    RNA('\uE959'),
    WAR('\uE95A'),
    ELD('\uE95E'),
    THB('\uE961'),
    IKO('\uE962'),
    ZNR('\uE963'),
    KHM('\uE974'),
    STX('\uE975'),

    /**
     * Command Zone
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
    C19('\uE946'),
    C20('\uE966'),
    ZNC('\uE967'),
    CC1('\uE968'),
    CMR('\uE969'),
    CMC('\uE969'),
    KHC('\uE97D'),

    /**
     * Reprint
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
    MH1('\uE95B'),
    _2XM('\uE96E'),
    JMP('\uE96F'),
    MB1('\uE971'),
    MH2('\uE97B'),

    /**
     * Beginner
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
     * Duel Decks
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
     * From the Vault
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
     * Premium Deck Series
     */
    H09('\uE67F'),
    PD2('\uE680'),
    PD3('\uE681'),
    MD1('\uE682'),

    /**
     * Signature Spellbooks
     */
    SS1('\uE944'),
    SS2('\uE95C'),
    SS3('\uE96D'),

    /**
     * Global Series
     */
    GS1('\uE945'),

    /**
     * Guild Kits
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
     * Other Supplemental Products
     */
    GNT('\uE94D'),
    GK1('\uE94B'),
    GK2('\uE959'),
    GN2('\uE964'),
    TSR('\uE976'),
    XIN3('\uE977'),
    XIN4('\uE978'),

    /**
     * Promotional
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
    PTG('\uE965'),
    J20('\uE96A'),
    ZNE('\uE97A'),

    /**
     * Online
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
    HA1('\uE96B'),
    AKR('\uE970'),
    KLR('\uE97C'),

    /**
     * Un-Serious
     */
    UGL('\uE691'),
    UNH('\uE692'),
    UST('\uE930'),
    UND('\uE96C'),

    /**
     * Unofficial
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
