buscar un numero en un array
numeros[]
int indice = Arrays.binarySearch(numeros,30); Si no existe te muestra el sitio ideal de insercción.
        Arrays.binarySearch(numeros,0,numeros.length-1,30);
int num2 = Arrays.arraycopy
int [] num2=Arrays.copyOf(numeros,numeros.length);
int [] num2=Arrays.copyOfRange(numeros,1,5); Estos hace una copia desde los indices que le pongas. No incluye el ultimo pero si el primero.
        Arrays.equals(numeros,numeros2); compara dos arrays, si son arrays iguales retorna true si son diferentes retorna false