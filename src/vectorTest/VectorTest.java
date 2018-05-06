package vectorTest;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import vector.Vector;

/*
 * Klasse verantwoordelijk voor het testen van de klasse Vector.
 */

public class VectorTest {

//  Constante voor het meten van afrondingsverschillen bij het vergelijken van doubles.
  private static final double EPSILON = 1e-16;
  
//  Declaratie variabelen t.b.v. setUp()
  private Vector vectorA;
  private Vector vectorB;
  private Vector vectorC;
  private Vector vectorD;
  private Vector vectorE;
  private Vector vectorF;
  private Vector vectorG;
  private Vector vectorH;
  private Vector vectorI;
  private Vector vectorK;
  
  private Vector vectorNul;
  
  @Before
  public void setUp() {
    
//    Vectoren t.b.v. de testen
    vectorA = new Vector(2, 4);
    vectorB = new Vector(3, 2);
    vectorC = new Vector(4, 5);
    vectorD = new Vector(3, 2);
    vectorE = new Vector(4, 8);
    vectorF = new Vector(3, 3);
    vectorG = new Vector(2, 4);
    vectorH = new Vector(4, 0);
    vectorI = new Vector(3, 4);
    vectorK = new Vector(-7, -4);
    vectorNul = new Vector(0, 0);

  }
  
  @Test
  public void testVector() {
//    Test of de nieuwe vector juist geininitialiseerd wordt met de correcte waarden voor x en y.

    assertEquals(2, vectorA.getX(), EPSILON);
    assertEquals(4, vectorA.getY(), EPSILON);
  }
  
  @Test
  public void testKopie() {
//  Test of de kopie van de vector juist geininitialiseerd wordt met de correcte waarden voor x en y.

    Vector vectorKopie = vectorA.kopie();

    assertEquals(2, vectorKopie.getX(), EPSILON);
    assertEquals(4, vectorKopie.getY(), EPSILON);
  }
  
  @Test
  public void testGetX() {
//  Test de vector de correcte waarde teruggeeft voor x.
    
    assertEquals(2, vectorA.getX(), EPSILON);
    assertEquals(3, vectorB.getX(), EPSILON);
    assertEquals(-7, vectorK.getX(), EPSILON);
  }

  @Test
  public void testGetY() {
//  Test de vector de correcte waarde teruggeeft voor y.
    
    assertEquals(4, vectorA.getY(), EPSILON);
    assertEquals(0, vectorNul.getY(), EPSILON);
    assertEquals(-4, vectorK.getY(), EPSILON);
  }

  @Test
  public void testGetLengte() {
//    Test of de juiste lengte berekend wordt.
    
    assertEquals(5,vectorI.getLengte(), EPSILON);
    assertEquals(8.06225774829855,vectorK.getLengte(), EPSILON);
    assertEquals(0.0,vectorNul.getLengte(), EPSILON);
  }

  @Test
  public void testGetAfstand() {
//    Test of de juiste afstand berekend wordt.
    
    assertEquals(3.1622776601683793319988935444327, vectorC.getAfstand(vectorD), EPSILON);
    assertEquals(4.47213595499958, vectorA.getAfstand(vectorNul), EPSILON);
    assertEquals(14.212670403551895, vectorC.getAfstand(vectorK), EPSILON);
  }

  @Test
  public void testPlus() {
//    Test of vector c de juiste opgetelde x en y waarden bevat van vector a en b.
    Vector vectorPlus = vectorC.plus(vectorD);
    Vector vectorPlusTwee = vectorA.plus(vectorK);
    
    assertEquals(7, vectorPlus.getX(), EPSILON);
    assertEquals(7, vectorPlus.getY(), EPSILON);
    assertEquals(-5, vectorPlusTwee.getX(), EPSILON);
    assertEquals(0, vectorPlusTwee.getY(), EPSILON);
  }

  @Test
  public void testHeeftZelfdeRichting() {
//    Test of vector A en B dezelfde richting hebben. En of A en C, en B en C niet dezefde richting hebben.

    assertEquals(true, vectorA.heeftZelfdeRichting(vectorE));
    assertEquals(false, vectorA.heeftZelfdeRichting(vectorF));
    assertEquals(false, vectorE.heeftZelfdeRichting(vectorF));
    assertEquals(false, vectorNul.heeftZelfdeRichting(vectorE));
    assertEquals(false, vectorA.heeftZelfdeRichting(vectorNul));
  }

  @Test
  public void testEquals() {
//    Test of A en B gelijke waarden hebben en A en B, en B en C niet.

    assertEquals(true, vectorA.equals(vectorG));
    assertEquals(false, vectorA.equals(vectorF));
    assertEquals(false, vectorG.equals(vectorF));
  }

  @Test
  public void testMaal() {
//    Test of vector B juist vermenigvuldigd is met 3.

    Vector vectorMaal = vectorA.maal(3);
    Vector vectorMaalTwee = vectorK.maal(2);

    assertEquals(6, vectorMaal.getX(), EPSILON);
    assertEquals(12, vectorMaal.getY(), EPSILON);
    assertEquals(-14, vectorMaalTwee.getX(), EPSILON);
    assertEquals(-8, vectorMaalTwee.getY(), EPSILON);
  }

  @Test
  public void testGetInproduct() {
//    Test of het inwendig product tussen A en B juist berekend wordt.

    assertEquals(12, vectorH.getInproduct(vectorI), EPSILON);
    assertEquals(-28.0, vectorH.getInproduct(vectorK), EPSILON);
    assertEquals(0.0, vectorH.getInproduct(vectorNul), EPSILON);
  }

  @Test
  public void testGetHoek() {
//    Test of de hoek juist berekend wordt.

    assertEquals(0.92729521800161223242851246292243, vectorI.getHoek(), EPSILON);
    assertEquals(0.5191461142465229, vectorK.getHoek(), EPSILON);
    assertEquals(-1, vectorNul.getHoek(), EPSILON);
    
  }

}
