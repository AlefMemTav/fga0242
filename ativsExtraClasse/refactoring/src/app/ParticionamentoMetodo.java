package app;

class ParticionamentoMetodo {
    private final int[] valores;
    private final int left;
    private final int right;
    private int pivot;
    private int i;
    
    public ParticionamentoMetodo(int[] valores, int left, int right) {
        this.valores = valores;
        this.left = left;
        this.right = right;
    }
    
    public int executar() {
        inicializarParticionamento();
        varrerETrocarElementos();
        return finalizarParticionamento();
    }
    
    private void inicializarParticionamento() {
        pivot = valores[left];
        i = left;
    }
    
    private void varrerETrocarElementos() {
        for (int j = i + 1; j <= right; j++) {
            if (valores[j] <= pivot) {
                i++;
                swap(i, j);
            }
        }
    }
    
    private int finalizarParticionamento() {
        swap(left, i);
        return i;
    }
    
    private void swap(int i, int j) {
        int temp = valores[i];
        valores[i] = valores[j];
        valores[j] = temp;
    }
}
