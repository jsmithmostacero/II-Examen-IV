/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encriptamiento;

/**
 *
 * @author HP
 */
public class Encriptar {

    private final String abecedario = "abcdefghijklmnñopqrstuvwxyz";
    private final char[] arreglo = abecedario.toCharArray();
    private boolean [] estados;
    private int clave;
    private String texto;
    private String criptado;
    private String desencriptado;

    public Encriptar(int clave, String texto) {
        this.clave = clave;
        this.texto = texto;
    }

    public int retornaPos(char a) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public boolean verificarVocal(char a) {
        boolean retorno;
        retorno = a=='a' || a=='e' || a=='i' ||a=='o' ||a=='u';
        return retorno;
    }
    
    public char retorno(int pos){       
        if(pos<0){
            if(pos%27==0){
                pos=0;
            }else{
               pos =  27-(Math.abs(pos)%27);
            }
        }
        if(pos>26){
            pos = pos%27;
        }
        return arreglo[pos];
    }

    public void encriptado() {
        String encripTem="";
        char[] text = texto.toCharArray();
        estados = new boolean[text.length];
        int position;
        for (int i = 0; i < text.length; i++) {
            estados[i] = verificarVocal(text[i]);
            if(verificarVocal(text[i])){
                position = retornaPos(text[i])-2*clave;
            }else{
                position = retornaPos(text[i])+clave;
            }
            encripTem+=retorno(position);
        }
        setCriptado(encripTem);
    }
    
    public void desencriptado(String criptado){
        String dencripTem = "";
        char[] text = criptado.toCharArray();
        int position;
        for (int i = 0; i < text.length; i++) {
            if(estados[i]){
                position = retornaPos(text[i])+2*clave;
            }else{
                position = retornaPos(text[i])-clave;
            }
            dencripTem+=retorno(position);
        }
        setDesencriptado(dencripTem);
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getCriptado() {
        encriptado();
        return criptado;
    }

    private void setCriptado(String criptado) {
        this.criptado = criptado;
    }

    public String getDesencriptado(String encriptado) {
        desencriptado(encriptado);
        return desencriptado;
    }

    private void setDesencriptado(String desencriptado) {
        this.desencriptado = desencriptado;
    }

}
