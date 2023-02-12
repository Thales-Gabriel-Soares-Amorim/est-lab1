public class ListaArray implements EstruturaDeDados{

    @Override
    public boolean insert(int chave) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete(int chave) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean search(int chave) {
        
        return false;
    }

    @Override
    public int minimum() {
        if (inicio == null){
            return 0;
        }
        else {
            return min(inicio);
        }
    }

    @Override
    public int maximum() {
        if (inicio == null){
            return 0;
        }
        else {
            return max(inicio);
        }
    }

    @Override
    public int sucessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
    }
}
