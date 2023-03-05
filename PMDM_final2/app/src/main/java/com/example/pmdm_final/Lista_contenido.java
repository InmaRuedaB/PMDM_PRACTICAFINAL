package com.example.pmdm_final;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lista_contenido {
    //creamos una lista con los distintos animales
    public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();

    //le asiganmos un identificador a cada componente d el alista
    public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();

    //rellenamos nuestra lista de animales
    static {
        aniadirEntrada(new Lista_entrada("0", R.drawable.im_buho, "BUHO", "Búho es el nombre común de aves de la familia Strigidae, del orden de los estrigiformes o aves rapaces nocturnas. Habitualmente designa especies que, a diferencia de las lechuzas, tienen plumas alzadas que parecen orejas (sus verdaderas orejas se encuentran al costado de la cabeza, a los laterales de los ojos) y presentan una coloración amarilla o naranja en el iris. Debido a que sus ojos carecen de movilidad y solo pueden ver hacia delante, pueden girar la cabeza 270°", R.drawable.return_button));
        aniadirEntrada(new Lista_entrada("1", R.drawable.im_colibri, "COLIBRÍ", "Los colibríes son seres nativos de casi todos los ecosistemas, bosques templados, selvas húmedas, desiertos, incluso en los picos más montañosos y altos de todo el continente americano. Estas hermosas avecillas de apenas 2-4 gramos destacan entre los seres polinizadores; poseen una aguda visión, unas plumas tornasol en el cuello, unos pies cortos, pico largo y delgado, una lengua tubular que enrolla en la cabeza, la cual es más larga que el pico y con la cual chupa el néctar de las flores.", R.drawable.return_button));
        aniadirEntrada(new Lista_entrada("2", R.drawable.im_cuervo, "CUERVO", "El cuervo grande (Corvus corax),anteriormente denominado cuervo común por la SEO,es una especie de ave paseriforme de la familia Corvidae. Presente en casi todo el hemisferio septentrional, es la especie de córvido con la mayor superficie de distribución. A pesar de ello, la corneja negra (Corvus corone), de menor tamaño aunque muy similar en su aspecto morfológico externo, es muy abundante en sus propias áreas de distribución, por lo que a menudo se confunde a las cornejas negras con cuervos grandes. Con el cuervo de pico grueso, el cuervo grande es el mayor de los córvidos y probablemente la paseriforme más pesada; en su madurez, el cuervo grande mide entre 52 y 69 cm de longitud y su peso varía de 0,69 a 1,7 kg. Los cuervos grandes viven generalmente de diez a quince años, pero algunos individuos han vivido cuarenta años. Los jóvenes pueden desplazarse en grupos pero las parejas ya formadas permanecen juntas toda su vida, cada pareja defendiendo un territorio. Existen ocho subespecies conocidas que se diferencian muy poco aparentemente, aunque estudios recientes hayan demostrado diferencias genéticas significativas entre las poblaciones de distintas regiones.", R.drawable.return_button));
        aniadirEntrada(new Lista_entrada("3", R.drawable.im_flamenco, "FLAMENCO", "El flamenco es un género musical español que se desarrolló en Andalucía, especialmente en las zonas de Cádiz y sus puertos, San Fernando, Jerez de la Frontera, Sevilla y los pueblos de su provincia como Lebrija y Utrera, Huelva, Granada y Córdoba así como en algunas áreas de la Región de Murcia, Castilla-La Mancha y Extremadura.Sus principales facetas son el cante, el toque, y el baile, contando también con sus propias tradiciones y normas. Tal y como lo conocemos hoy en día, el flamenco data del siglo XVIII, y existe controversia sobre su origen, ya que aunque existen distintas opiniones y vertientes, ninguna de ellas ha podido ser comprobada de forma histórica. Aunque el diccionario de la RAE lo asocia a la cultura popular andaluza y a la notable presencia del pueblo gitano en aquella,es más que perceptible la fusión de las distintas culturas que coincidieron en la Andalucía de la época. Aunque sí es cierto que los gitanos llegaron a España en el s. XV y a pesar de restricciones vitales y antigitanismo lograron asentarse en Andalucía alrededor del s. XVI-XVII, cuando inició el flamenco. Seguramente el bagaje cultural que el pueblo gitano arrastró desde su peregrinaje de la India fue a converger con los sonidos autóctonos andaluces, dando lugar al flamenco.", R.drawable.return_button));
        aniadirEntrada(new Lista_entrada("4", R.drawable.im_kiwi, "KIWI", "Los kiwis (Apteryx, del griego α- [a-] 'sin' y πτέρυξ [ptéryx], 'ala') constituyen un pequeño género de aves paleognatas, el único actual de la familia Apterygidae, que a su vez pertenece al orden de las ratites (Struthioniformes). Este género está compuesto por cinco especies endémicas de Nueva Zelanda.Son aves no voladoras pequeñas, aproximadamente del tamaño de una gallina (25-45cm). Antes de la llegada del ser humano, alrededor del año 1300, en Nueva Zelanda los únicos mamíferos eran los murciélagos, y los nichos ecológicos que en otras partes del mundo ocupan animales tan diversos como los caballos, los lobos y los ratones los utilizaron en Nueva Zelanda las aves (y, en menor proporción, ciertas especies de reptiles). El término kiwi procede del maorí.", R.drawable.return_button));
        aniadirEntrada(new Lista_entrada("5", R.drawable.im_loro, "LORO", "Los loros típicos (Psittacoidea) son una superfamilia del orden Psittaciformes, con un total de 369 especies. Los loros típicos son más numerosos y están más extendidos que las otras superfamilias de psitaciformes, las cacatúas y los escasos y confinados loros de Nueva Zelanda, ya que tienen representantes en América, África, Asia y Oceanía (desde Australia hasta la Polinesia).", R.drawable.return_button));
        aniadirEntrada(new Lista_entrada("6", R.drawable.im_pavo, "PAVO", "El pavo doméstico o 'guajolote' es un ave de corral de gran tamaño utilizada en la alimentación humana, fundamentalmente por su carne, y en mucha menor medida por sus huevos. Fue introducido como ave doméstica en casi todo el mundo. La mayor demanda de carne de pavo ocurre para la fecha de Navidad.[cita requerida. El agriotipo de esta ave domesticada es el guajolote o pavo salvaje mexicano (Meleagris gallopavo mexicana), una subespecie del pavo salvaje común (Meleagris gallopavo), especie que aún vive en los bosques de México y Estados Unidos.", R.drawable.return_button));
    }

    //método para añadir animales
    private static void aniadirEntrada(Lista_entrada entrada) {
        ENTRADAS_LISTA.add(entrada);
        ENTRADAS_LISTA_HASHMAP.put(entrada.id, entrada);
    }

    //clase para la entrada de animales
    public static class Lista_entrada {
        public String id;
        public int idImagen;
        public String textoEncima;
        public String textoDebajo;

        public int idButtom;

        public Lista_entrada (String id, int idImagen, String textoEncima, String textoDebajo, int idButtom) {
            this.id = id;
            this.idImagen = idImagen;
            this.textoEncima = textoEncima;
            this.textoDebajo = textoDebajo;
            this.idButtom = idButtom;
        }
    }

}