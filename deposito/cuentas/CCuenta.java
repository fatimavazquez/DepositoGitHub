package cuentas;
/**
* Esta clase almacena los datos de una cuenta bancaria y opera con ellos.
* 
* @author Fatima
*  */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Crea una cuenta sin recibir par�metros
     */
    public CCuenta()
    {
    }

    /**
     * Crea una cuenta bancaria recibiendo par�metros
     * @param nom nombre de la cuenta
     * @param cue numeraci�n de la cuenta
     * @param sal saldo inicial
     * @param tipo tipo de inter�s
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

   /**
    * Devuelve el saldo de la cuenta bancaria
    * @return saldo almacenado
    */
    public double estado()
   
    {
        return getSaldo();
    }

    /**
     * Ingresa saldo en la cuenta
     * @param cantidad importe a ingresar
     * @throws Exception Da error si se imtroduce una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
    	
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira saldo de la cuenta bancaria
     * @param cantidad importe a retirar
     * @throws Exception "No se puede retirar una cantidad negativa" si el importe es menor que cero, "No hay suficiente saldo" si el importe es superior al saldo de la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
    	
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve el nombre de la cuenta
     * @return nombre de la cuenta bancaria
     */
	private String getNombre() {
		
		return nombre;
	}

	/**
	 * Guarda el nombre de la cuenta
	 * @param nombre nombre que se quiere asignar a la cuenta
	 */
	private void setNombre(String nombre) {
		
		this.nombre = nombre;
	}

	/**
	 * Devuelve el n�mero de cuenta
	 * @return n�mero de cuenta bancaria almacenado
	 */
	private String getCuenta() {
		
		return cuenta;
	}

	/**
	 * Almacena el n�mero de cuenta bancaria
	 * @param cuenta numeraci�n de la cuenta
	 */
	private void setCuenta(String cuenta) {
		
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el saldo de la cuenta
	 * @return saldo almacenado de la cuenta bancaria
	 */
	private double getSaldo() {
		
		return saldo;
	}

	/**
	 * Fija el saldo de la cuenta bancaria
	 * @param saldo importe a guardar como saldo de la cuenta
	 */
	private void setSaldo(double saldo) {
	
		this.saldo = saldo;
	}

	/**
	 * Devuelve el tipo de inter�s
	 * @return Tipo de inter�s almacenado de la cuenta bancaria
	 */
	private double getTipoInteres() {
		
		return tipoInteres;
	}

	/**
	 * Fija el tipo de inter�s de la cuenta
	 * @param tipoInteres tipo de inter�s a guardar
	 */
	private void setTipoInteres(double tipoInteres) {
		
		this.tipoInteres = tipoInteres;
	}
}
