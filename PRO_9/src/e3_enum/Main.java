package e3_enum;

public class Main {


	public enum typeMap {
		TYPE_MAP, TYPE_SATELLYTE, TYPE_HIBRYD, TYPE_TERRAIN
	}
	static typeMap typeMaps;

	public static void main(String[] args) {
		typeMaps = typeMap.TYPE_SATELLYTE;
		
		
		switch (typeMaps) {
		case TYPE_MAP:
			System.out.println("The map is a map type");
		case TYPE_SATELLYTE:
			System.out.println("The maps is a satellyte map");
		case TYPE_HIBRYD:
			System.out.println("The map is a hibryd map");
		case TYPE_TERRAIN:
			System.out.println("The map is a terrain map");
		}

	}

}
