import java.util.Collections;
import java.util.Vector;

/**
 * Created by 46066294 on 20/01/2016.
 */
public class GrupOrdenatFiguraGeometricaViaVector {
    private Vector<FiguraGeometrica02> vector;

    public GrupOrdenatFiguraGeometricaViaVector(int dimensionVector) {
        if (dimensionVector < 0)
            throw new IllegalArgumentException("...debe ser entero positivo (o zero)" + dimensionVector);
        vector = new Vector<FiguraGeometrica02>(dimensionVector);
    }

    public void ordenarVectorPorCodigo() {
        Collections.sort(vector);
    }

    /**
     * Metodo que anyade un objeto al vector
     * de tipo Vector<FiguraGeometrica02>
     * @param obj
     * @return Control de errores para clase controladora
     */
    public int anyadir(FiguraGeometrica02 obj) {
        int i;

        if (obj == null) return -2;

        i = vector.indexOf(obj);

        if (i >= 0) return i;

        vector.add(obj);
        this.ordenarVectorPorCodigo();

        return -1;
    }

    /**
     * Busca el objeto con el codigo y lo elimina
     * @param codigo id del objeto
     * @return
     */
    public void eliminar(int codigo) {
        int i;
        for (i = 0; i < vector.size() && vector.get(i).getCodi() != codigo; i++) ;
        if (i == vector.size()){
            System.out.println("::null::");
        }
        System.out.println("...objeto " + vector.get(i) + " eliminado");
        vector.remove(i);
    }



}
