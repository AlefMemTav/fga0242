package app;

public class QuickSort {
    private int[] valores;
    
    private QuickSort(int[] valores) {
        this.valores = valores;
    }
    
    public static QuickSort getInstancia(int[] valores) {
        return new QuickSort(valores);
    }
    
    public int getSize() {
        return valores.length;
    }
    
    public int particionamento(int left, int right) {
        return new ParticionamentoMetodo(valores, left, right).executar();
    }
    
    private void swap(int i, int j) {
        int temp = valores[i];
        valores[i] = valores[j];
        valores[j] = temp;
    }
    
    public int[] ordenar(int left, int right) {
        if (left < right) {
            int indicePivot = particionamento(left, right);
            ordenar(left, indicePivot - 1);
            ordenar(indicePivot + 1, right);
        }
        return valores;
    }
}
