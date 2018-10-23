public class Horario{
		public static void main (String[]args) {
			String rojo = "\033[31m";
			String verde = "\033[32m";
			String naranja= "\033[33m";
			String azul = "\033[34m";
			String morado = "\033[35m";
			String blanco = "\033[4;37m";
			String cyan = "\033[4;36m";
			String stab ="\t" ;
			System.out.println(blanco+" \t"+"\t"+"Lunes\t"+"Martes\t"+"Miérc.\t"+"Jueves\t"+"Viernes\t");
			System.out.println("8:15-9:15\t"+naranja+"FOL\t"+morado+"Prog\t"+naranja+"FOL\t"+morado+"Prog\t"+azul+"LMarc\t");
			System.out.println(blanco+"9:15-10:15\t"+naranja+"FOL\t"+morado+"Prog\t"+cyan+"Ent.Des\t"+morado+"Prog\t"+azul+"LMarc\t");
			System.out.println(blanco+"10:15-11:15\t"+morado+"Prog\t"+verde+"BDat\t"+azul+"LMarc\t"+verde+"BDat\t"+morado+"Prog\t");
			System.out.println(blanco+"11:15-11:45\t"+"Recreo\t"+"Recreo\t"+"Recreo\t"+"Recreo\t"+"Recreo\t");
			System.out.println(blanco+"11:45-12:45\t"+morado+"Prog\t"+verde+"BDat\t"+azul+"LMarc\t"+verde+"BDat\t"+morado+"Prog\t");
			System.out.println(blanco+"12:45-13:45\t"+verde+"BDat\t"+cyan+"EntDes\t"+rojo+"S.Info.\t"+rojo+"S.Info.\t"+rojo+"S.Info.\t");
			System.out.println(blanco+"13:45-14:45\t"+verde+"BDat\t"+cyan+"EntDes\t"+rojo+"S.Info.\t"+rojo+"S.Info.\t"+rojo+"S.Info.\t"+blanco);
		}
}
