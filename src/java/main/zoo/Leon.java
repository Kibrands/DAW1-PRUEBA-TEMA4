package zoo;

/**
 * 
 * Clase león que extiende de Mamífero
 * 
 * @author usuario
 * @see Mamifero
 * @version 0.1
 * @since 2019-05-13
 */
public class Leon extends Mamifero {
 
    private String rugido = "GRRRRR";
    
    /**
     * Constructor por default de la clase Leon
     */
    public Leon () {}
    
    /**
     * 
     * Constructor heredado
     * 
     * @param habitat habitat del león
     * @param comida comida del león
     * @param longevidad longevidad del león
     * @param periodoLactancia periodo de lactanacia del león
     * 
     * @see Habitat
     */
    public Leon (Habitat habitat, String comida, int longevidad, int periodoLactancia) {
        super(habitat, comida, longevidad, periodoLactancia);
    }
    
    /**
     * 
     * Setter del campo rugido
     * 
     * @param rugido rugido del león
     */
    public void setRugido (String rugido) { this.rugido = rugido; }
    
    /**
     * 
     * Getter del campo rugido
     * 
     * @return rugido
     */
    public String getRugido () { return rugido; }
    
    /**
     * Método para que león pueda rugir
     */
    public void rugir () { System.out.println(rugido); }
    
    /**
     * Método para que el león coma
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     * Método para que el león se desplace buscando su comida
     */
    public void desplazar () { System.out.println("Estoy en busca de " + comida); }
}
