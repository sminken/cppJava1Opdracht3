package vector;
/*
 * De klasse Vector is verantwoordelijk voor het beheer van de vectoren. De klasse beschikt 
 * over methoden om berekeneningen met vectoren te maken.
 * @author CPP Java1 opdracht 3 Steven Minken november 2017
 */

public class Vector {

//  Attributen met standaardwaarde 0.
  
  private double x;
  private double y;
  
//  Constructor 
  public Vector(double x, double y) {
    this.x = x;
    this.y = y;
  }
  
//  Methoden
/*
  * Levert een kopie van deze vector met dezelfde waarden voor x en y.
  * @return Vecor Nieuwe vector die een kopie is van deze vector.
  */
 public Vector kopie() {
   
   return new Vector(x, y);
   
 }
 
/*
 *   Geeft de waarde van x terug. Benodigd om berekeningen te kunnen maken tussen 2 vectoren.
 *   @return double De waarde van x van de vector.
 */
  public double getX() {
    
    return x;
    
  }
  
/*
 *  Geeft de waarde van y terug. Benodigd om berekeningen te kunnen maken tussen 2 vectoren.
 *  @return double De waarde van y van de vector.
 */
  public double getY() {
    
    return y;
    
  }

/*
 * Berekent de lengte van een vector. 
 */
  public double getLengte() {
    
    return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

  }
  
  /*
   * Berekent de afstand tussen deze vector en andere vector.
   * @param Vector Andere vector als formele parameter om berekeningen mee uit te voeren.
   * @return Afstand tussen de vectoren als double.
   */
  public double getAfstand(Vector andereVector) {
    
    return Math.sqrt(Math.pow((x - andereVector.getX()), 2) + Math.pow((y - andereVector.getY()), 2));
    
  }
  
  /*
   * Levert een nieuwe vector op die de som is van deze vector en andere vector.
   * @param Vector als formele parameter
   * @return Nieuwe vector die de som is van deze vector en andere vector.
   */
  public Vector plus(Vector andereVector) {

    return new Vector((x + andereVector.getX()), (y + andereVector.getY()));

  }
  
  /*
   * Geeft aan of deze vector en v dezelfde richting hebben d.m.v de methode compare() uit de klasse Double.
   * @Vector als formele parameter.
   * @return boolean True indien vectoren dezelfde richting hebben en false indien dit niet het geval is.
   */
  public boolean heeftZelfdeRichting(Vector andereVector) {

    if ((x == 0 && y == 0) || (andereVector.getX() == 0 && andereVector.getY() == 0))  {
      return false;
    }  else
    return Double.compare((x / andereVector.getX()), (y / andereVector.getY())) == 0;

  }
  
  /*
   * Geeft aan of deze vector en v gelijk zijn d.m.v de methode compare() uit de klasse Double.
   * Geeft een boolean terug met waarde true indien de doubles hetzelfde zijn.
   * @Vector als formele parameter.
   * @return boolean True indien vectoren gelijk zijn en false indien dit niet het geval is.
   */
  public boolean equals(Vector andereVector) {
    
    return (Double.compare(x, andereVector.getX()) == 0  && Double.compare(y, andereVector.getY()) == 0);
 
  }
  
  /*
   * Levert een nieuwe vector waarbij x en y zijn vermenigvuldigd met factor d.
   * @param d Factor ter vermenigvuldiging.
   * @return Vector Nieuwe vector die het resultaat is van de vermenigvuldiging van deze vector maak factor d.
   */
  public Vector maal(double d) {
    
    return new Vector((x * d), (y * d));
    
  }
  
  /*
   * Berekent het inwendig product van deze vector en andereVector.
   * @param Vector als formele parameter.
   * @return double reslutaat van het inproduct van de 2 vectoren.
   */
  public double getInproduct(Vector andereVector) {

    return ((x * andereVector.getX()) + (y * andereVector.getY()));
    
  }
  
  /*
   * Berekent de hoek van deze vector met de x-as
   * @return double De hoek van de vector met de x-as.
   */
  public double getHoek() {
    
    if (x == 0 && y == 0)  {
      return -1;
    }  else
    return Math.atan(y / x);

  }

}

