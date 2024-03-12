package gp.util;

public class StringUtils {

	/**
	 * Concatena una cadena consigo misma un determinado n�mero de veces
	 */
	public static String repeat(String x, int n) {
		StringBuilder result = new StringBuilder(x.length() * n);

		for (int i = 0; i < n; i++)
			result.append(x);

		return result.toString();
	}
	
	public static String center(String texto, int ancho) {
		return center(texto, ancho, ' ');
	}

	public static String center(String texto, int ancho, char relleno) {
		if (ancho > texto.length()) {
			StringBuilder result = new StringBuilder(ancho);
			
			int vacio = ancho - texto.length();
			int pre = vacio / 2;
			int post = (vacio + 1) / 2;
			
			result.append(repeat("" + relleno, pre));
			result.append(texto);
			result.append(repeat("" + relleno, post));
			
			return result.toString();
		}
		else
			return texto.substring(0, ancho);
	}
}