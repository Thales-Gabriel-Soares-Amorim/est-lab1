public interface EstruturaDeDados {

    public int [] arrayList;
    public int contador = 0;
    public int chave;
    private metodoDeInsercao (){
     arrayList = new int [10];
     contador +=1;
    }


    
    public boolean insert(int chave){
        if (contador < this.arrayList.length){
            this.arrayList[contador] = chave;
            contador +=1;
            return true;
        } else {
            return false;
        }
    };
     
    public boolean delete(int chave);

    public boolean search(int chave){ //encontrar o numero desejado
        //fazer o metodo
        while(contador != this.arrayList.length){  //verifica
         if(arrayList[i] == chave){
            return true // quando acha imprime true
         }
         
            contador +=1; // anda o contador
         
        }; 
    };

    public int minimum();
      //compara os numeros do array e fala qual o menor
      int valorMin = arrayList[0];
      //bota o max inicialmente igual a primeira posição do array

    public int maximum(){;
      //compara os numeros do array e fala qual o maior
      int valorMax = arrayList[0]; 
      //bota o max inicialmente igual a primeira posição do array

      for(int j: arrayList){
        if(j >valorMax) //compara
        valorMax = j;
      }
    }
       return valorMax;
    public int sucessor(int chave){ //depois de encontrar me diz o sucessor
        //fazer o metodo
        while(contador != this.arrayList.length){  //verifica
         contador +=1; // anda o contador
         if(contador == this.arrayList.length){
            return contador;
         }
         if(contador == this.arrayList.length){
            return contador;
        }

    public int prodessor(int chave){ //depois de encontrar me diz o predessor
        //fazer o metodo
        while(contador != this.arrayList.length){  //verifica
         contador +=1; // anda o contador
         if(contador == this.arrayList.length){
            contador = contador -1;
            return contador;
         }
         if(contador == this.arrayList.length){
            contador = contador -1;
            return contador;
    }
    }
    }
}
    }
    