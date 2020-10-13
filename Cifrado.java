/**
 * Clase Cifrado
 *
 * Clase que contiene MD5 y SHA1, métodos de cifrado de contraseñas en la base de datos
 *
 * @author Priscilla González
 */

public class Cifrado {
	public static String getCifrado(String txt, String hashType) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance(hashType);
            byte[] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
 
    // Retorna un hash MD5 a partir de un texto 
    public static String md5(String txt) {
        return Cifrado.getCifrado(txt, "MD5");
    }
 
    //Retorna un hash SHA1 a partir de un texto 
    public static String sha1(String txt) {
        return Cifrado.getCifrado(txt, "SHA1");
    }
}
