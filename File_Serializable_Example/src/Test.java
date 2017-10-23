
public class Test {

	public static void main(String[] args) {
		
		SerializableYazma yaz = new SerializableYazma();
		yaz.dosyaAc();
		yaz.dosyayaYaz();
		yaz.dosyaKapat();
		SerializableOkuma oku = new SerializableOkuma();
		oku.dosyaAc();
		oku.dosyaOku();
		oku.dosyaKapat();

	}

}
