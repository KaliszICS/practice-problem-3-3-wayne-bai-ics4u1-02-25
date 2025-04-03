import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
public class PracticeProblemTest {
@Test
@DisplayName("")
void permsTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("perms", cArg);
  // Enter code here
    List<String> actual = (List<String>)method.invoke(null, "bob");
  String e[] = {"bob", "bbo", "obb", "obb", "bob", "bbo"};
  List<String> expected = Arrays.asList(e);
  Collections.sort(actual);
  Collections.sort(expected);
  assertEquals(expected, actual);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void permsTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("perms", cArg);
  // Enter code here
    List<String> actual = (List<String>)method.invoke(null, "bye");
  String e[] = {"bye", "bey", "ybe", "yeb", "eby", "eyb"};
  List<String> expected = Arrays.asList(e);
  Collections.sort(actual);
  Collections.sort(expected);
  assertEquals(expected, actual);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void permsUniqueTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("permsUnique", cArg);
  // Enter code here
    List<String> actual = (List<String>)method.invoke(null, "CODING");
  String e[] = "CODING OCDING DCOING CDOING ODCING DOCING IOCDNG OICDNG CIODNG ICODNG OCIDNG COIDNG CDIONG DCIONG ICDONG CIDONG DICONG IDCONG IDOCNG DIOCNG OIDCNG IODCNG DOICNG ODICNG NDICOG DNICOG INDCOG NIDCOG DINCOG IDNCOG CDNIOG DCNIOG NCDIOG CNDIOG DNCIOG NDCIOG NICDOG INCDOG CNIDOG NCIDOG ICNDOG CINDOG CIDNOG ICDNOG DCINOG CDINOG IDCNOG DICNOG OICNDG IOCNDG COINDG OCINDG ICONDG CIONDG NIOCDG INOCDG ONICDG NOICDG IONCDG OINCDG OCNIDG CONIDG NOCIDG ONCIDG CNOIDG NCOIDG NCIODG CNIODG INCODG NICODG CINODG ICNODG DCNOIG CDNOIG NDCOIG DNCOIG CNDOIG NCDOIG OCDNIG CODNIG DOCNIG ODCNIG CDONIG DCONIG DNOCIG NDOCIG ODNCIG DONCIG NODCIG ONDCIG ONCDIG NOCDIG CONDIG OCNDIG NCODIG CNODIG INODCG NIODCG OINDCG IONDCG NOIDCG ONIDCG DNIOCG NDIOCG IDNOCG DINOCG NIDOCG INDOCG IODNCG OIDNCG DIONCG IDONCG ODINCG DOINCG DONICG ODNICG NDOICG DNOICG ONDICG NODICG GODICN OGDICN DGOICN GDOICN ODGICN DOGICN IOGDCN OIGDCN GIODCN IGODCN OGIDCN GOIDCN GDIOCN DGIOCN IGDOCN GIDOCN DIGOCN IDGOCN IDOGCN DIOGCN OIDGCN IODGCN DOIGCN ODIGCN CDIGON DCIGON ICDGON CIDGON DICGON IDCGON GDCION DGCION CGDION GCDION DCGION CDGION CIGDON ICGDON GCIDON CGIDON IGCDON GICDON GIDCON IGDCON DGICON GDICON IDGCON DIGCON OIGCDN IOGCDN GOICDN OGICDN IGOCDN GIOCDN CIOGDN ICOGDN OCIGDN COIGDN IOCGDN OICGDN OGCIDN GOCIDN COGIDN OCGIDN GCOIDN CGOIDN CGIODN GCIODN ICGODN CIGODN GICODN IGCODN DGCOIN GDCOIN CDGOIN DCGOIN GCDOIN CGDOIN OGDCIN GODCIN DOGCIN ODGCIN GDOCIN DGOCIN DCOGIN CDOGIN ODCGIN DOCGIN CODGIN OCDGIN OCGDIN COGDIN GOCDIN OGCDIN CGODIN GCODIN ICODGN CIODGN OICDGN IOCDGN COIDGN OCIDGN DCIOGN CDIOGN IDCOGN DICOGN CIDOGN ICDOGN IODCGN OIDCGN DIOCGN IDOCGN ODICGN DOICGN DOCIGN ODCIGN CDOIGN DCOIGN OCDIGN CODIGN CNDIGO NCDIGO DCNIGO CDNIGO NDCIGO DNCIGO INCDGO NICDGO CINDGO ICNDGO NCIDGO CNIDGO CDINGO DCINGO ICDNGO CIDNGO DICNGO IDCNGO IDNCGO DINCGO NIDCGO INDCGO DNICGO NDICGO GDICNO DGICNO IGDCNO GIDCNO DIGCNO IDGCNO CDGINO DCGINO GCDINO CGDINO DGCINO GDCINO GICDNO IGCDNO CGIDNO GCIDNO ICGDNO CIGDNO CIDGNO ICDGNO DCIGNO CDIGNO IDCGNO DICGNO NICGDO INCGDO CNIGDO NCIGDO ICNGDO CINGDO GINCDO IGNCDO NGICDO GNICDO INGCDO NIGCDO NCGIDO CNGIDO GNCIDO NGCIDO CGNIDO GCNIDO GCINDO CGINDO IGCNDO GICNDO CIGNDO ICGNDO DCGNIO CDGNIO GDCNIO DGCNIO CGDNIO GCDNIO NCDGIO CNDGIO DNCGIO NDCGIO CDNGIO DCNGIO DGNCIO GDNCIO NDGCIO DNGCIO GNDCIO NGDCIO NGCDIO GNCDIO CNGDIO NCGDIO GCNDIO CGNDIO IGNDCO GINDCO NIGDCO INGDCO GNIDCO NGIDCO DGINCO GDINCO IDGNCO DIGNCO GIDNCO IGDNCO INDGCO NIDGCO DINGCO IDNGCO NDIGCO DNIGCO DNGICO NDGICO GDNICO DGNICO NGDICO GNDICO GNOICD NGOICD OGNICD GONICD NOGICD ONGICD INGOCD NIGOCD GINOCD IGNOCD NGIOCD GNIOCD GOINCD OGINCD IGONCD GIONCD OIGNCD IOGNCD IONGCD OINGCD NIOGCD INOGCD ONIGCD NOIGCD COIGND OCIGND ICOGND CIOGND OICGND IOCGND GOCIND OGCIND CGOIND GCOIND OCGIND COGIND CIGOND ICGOND GCIOND CGIOND IGCOND GICOND GIOCND IGOCND OGICND GOICND IOGCND OIGCND NIGCOD INGCOD GNICOD NGICOD IGNCOD GINCOD CINGOD ICNGOD NCIGOD CNIGOD INCGOD NICGOD NGCIOD GNCIOD CNGIOD NCGIOD GCNIOD CGNIOD CGINOD GCINOD ICGNOD CIGNOD GICNOD IGCNOD OGCNID GOCNID COGNID OCGNID GCONID CGONID NGOCID GNOCID ONGCID NOGCID GONCID OGNCID OCNGID CONGID NOCGID ONCGID CNOGID NCOGID NCGOID CNGOID GNCOID NGCOID CGNOID GCNOID ICNOGD CINOGD NICOGD INCOGD CNIOGD NCIOGD OCINGD COINGD IOCNGD OICNGD CIONGD ICONGD INOCGD NIOCGD OINCGD IONCGD NOICGD ONICGD ONCIGD NOCIGD CONIGD OCNIGD NCOIGD CNOIGD CNODGI NCODGI OCNDGI CONDGI NOCDGI ONCDGI DNCOGI NDCOGI CDNOGI DCNOGI NCDOGI CNDOGI CODNGI OCDNGI DCONGI CDONGI ODCNGI DOCNGI DONCGI ODNCGI NDOCGI DNOCGI ONDCGI NODCGI GODCNI OGDCNI DGOCNI GDOCNI ODGCNI DOGCNI COGDNI OCGDNI GCODNI CGODNI OGCDNI GOCDNI GDCONI DGCONI CGDONI GCDONI DCGONI CDGONI CDOGNI DCOGNI OCDGNI CODGNI DOCGNI ODCGNI NDCGOI DNCGOI CNDGOI NCDGOI DCNGOI CDNGOI GDNCOI DGNCOI NGDCOI GNDCOI DNGCOI NDGCOI NCGDOI CNGDOI GNCDOI NGCDOI CGNDOI GCNDOI GCDNOI CGDNOI DGCNOI GDCNOI CDGNOI DCGNOI OCGNDI COGNDI GOCNDI OGCNDI CGONDI GCONDI NCOGDI CNOGDI ONCGDI NOCGDI CONGDI OCNGDI OGNCDI GONCDI NOGCDI ONGCDI GNOCDI NGOCDI NGCODI GNCODI CNGODI NCGODI GCNODI CGNODI DGNOCI GDNOCI NDGOCI DNGOCI GNDOCI NGDOCI OGDNCI GODNCI DOGNCI ODGNCI GDONCI DGONCI DNOGCI NDOGCI ODNGCI DONGCI NODGCI ONDGCI ONGDCI NOGDCI GONDCI OGNDCI NGODCI GNODCI GNODIC NGODIC OGNDIC GONDIC NOGDIC ONGDIC DNGOIC NDGOIC GDNOIC DGNOIC NGDOIC GNDOIC GODNIC OGDNIC DGONIC GDONIC ODGNIC DOGNIC DONGIC ODNGIC NDOGIC DNOGIC ONDGIC NODGIC IODGNC OIDGNC DIOGNC IDOGNC ODIGNC DOIGNC GOIDNC OGIDNC IGODNC GIODNC OIGDNC IOGDNC IDGONC DIGONC GIDONC IGDONC DGIONC GDIONC GDOINC DGOINC OGDINC GODINC DOGINC ODGINC NDGIOC DNGIOC GNDIOC NGDIOC DGNIOC GDNIOC IDNGOC DINGOC NIDGOC INDGOC DNIGOC NDIGOC NGIDOC GNIDOC INGDOC NIGDOC GINDOC IGNDOC IGDNOC GIDNOC DIGNOC IDGNOC GDINOC DGINOC OGINDC GOINDC IOGNDC OIGNDC GIONDC IGONDC NGOIDC GNOIDC ONGIDC NOGIDC GONIDC OGNIDC OINGDC IONGDC NOIGDC ONIGDC INOGDC NIOGDC NIGODC INGODC GNIODC NGIODC IGNODC GINODC DINOGC IDNOGC NDIOGC DNIOGC INDOGC NIDOGC OIDNGC IODNGC DOINGC ODINGC IDONGC DIONGC DNOIGC NDOIGC ODNIGC DONIGC NODIGC ONDIGC ONIDGC NOIDGC IONDGC OINDGC NIODGC INODGC".split(" ");
  List<String> expected = Arrays.asList(e);
  Collections.sort(actual);
  Collections.sort(expected);
  assertEquals(expected, actual);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void permsUniqueTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("permsUnique", cArg);
  // Enter code here
    List<String> actual = (List<String>)method.invoke(null, "bob");
  String e[] = "bbo bob obb".split(" ");
  List<String> expected = Arrays.asList(e);
  Collections.sort(actual);
  Collections.sort(expected);
  assertEquals(expected, actual);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void permsUniqueTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("permsUnique", cArg);
  // Enter code here
    List<String> actual = (List<String>)method.invoke(null, "HELP");
  String e[] = "HELP EHLP LHEP HLEP ELHP LEHP PEHL EPHL HPEL PHEL EHPL HEPL HLPE LHPE PHLE HPLE LPHE PLHE PLEH LPEH EPLH PELH LEPH ELPH".split(" ");
  List<String> expected = Arrays.asList(e);
  Collections.sort(actual);
  Collections.sort(expected);
  assertEquals(expected, actual);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void permsUniqueTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("permsUnique", cArg);
  // Enter code here
    List<String> actual = (List<String>)method.invoke(null, "HELLO");
  String e[] = "EHLLO EHLOL EHOLL ELHLO ELHOL ELLHO ELLOH ELOHL ELOLH EOHLL EOLHL EOLLH HELLO HELOL HEOLL HLELO HLEOL HLLEO HLLOE HLOEL HLOLE HOELL HOLEL HOLLE LEHLO LEHOL LELHO LELOH LEOHL LEOLH LHELO LHEOL LHLEO LHLOE LHOEL LHOLE LLEHO LLEOH LLHEO LLHOE LLOEH LLOHE LOEHL LOELH LOHEL LOHLE LOLEH LOLHE OEHLL OELHL OELLH OHELL OHLEL OHLLE OLEHL OLELH OLHEL OLHLE OLLEH OLLHE".split(" ");
  List<String> expected = Arrays.asList(e);
  Collections.sort(actual);
  Collections.sort(expected);
  assertEquals(expected, actual);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void permsTest6() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("perms", cArg);
  // Enter code here
    List<String> actual = (List<String>)method.invoke(null, "HELPO");
  String e[] = "HELPO EHLPO LHEPO HLEPO ELHPO LEHPO PEHLO EPHLO HPELO PHELO EHPLO HEPLO HLPEO LHPEO PHLEO HPLEO LPHEO PLHEO PLEHO LPEHO EPLHO PELHO LEPHO ELPHO OLPHE LOPHE POLHE OPLHE LPOHE PLOHE HLOPE LHOPE OHLPE HOLPE LOHPE OLHPE OPHLE POHLE HOPLE OHPLE PHOLE HPOLE HPLOE PHLOE LHPOE HLPOE PLHOE LPHOE EPHOL PEHOL HEPOL EHPOL PHEOL HPEOL OPEHL POEHL EOPHL OEPHL PEOHL EPOHL EHOPL HEOPL OEHPL EOHPL HOEPL OHEPL OHPEL HOPEL POHEL OPHEL HPOEL PHOEL LHOEP HLOEP OLHEP LOHEP HOLEP OHLEP EHLOP HELOP LEHOP ELHOP HLEOP LHEOP LOEHP OLEHP ELOHP LEOHP OELHP EOLHP EOHLP OEHLP HEOLP EHOLP OHELP HOELP POELH OPELH EPOLH PEOLH OEPLH EOPLH LOPEH OLPEH PLOEH LPOEH OPLEH POLEH PELOH EPLOH LPEOH PLEOH ELPOH LEPOH LEOPH ELOPH OLEPH LOEPH EOLPH OELPH".split(" ");
  List<String> expected = Arrays.asList(e);
  Collections.sort(actual);
  Collections.sort(expected);
  assertEquals(expected, actual);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void permsTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("perms", cArg);
  // Enter code here
    List<String> actual = (List<String>)method.invoke(null, "te");
  String e[] = {"te", "et"};
  List<String> expected = Arrays.asList(e);
  Collections.sort(actual);
  Collections.sort(expected);
  assertEquals(expected, actual);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void permsTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("perms", cArg);
  // Enter code here
    List<String> actual = (List<String>)method.invoke(null, "a");
		String e[] = {"a"};
		List<String> expected = Arrays.asList(e);
		Collections.sort(actual);
		Collections.sort(expected);
		assertEquals(expected, actual);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void permsTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("perms", cArg);
  // Enter code here
    List<String> actual = (List<String>)method.invoke(null, "");
		String e[] = {""};
		List<String> expected = Arrays.asList(e);
		Collections.sort(actual);
		Collections.sort(expected);
		assertEquals(expected, actual);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
