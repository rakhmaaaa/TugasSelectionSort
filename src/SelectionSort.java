import Model.Nama;

public class SelectionSort {
    private String[] data;

    public void SelectionSort(){
        int i, j = 0, small;
        int n = this.data.length;
        for (i=0;i<n;i++){
            small = i;

            for (j=i;j<n;j++)
                if (this.data[j].compareToIgnoreCase(this.data[small])<0);
        }
        small = j;

        String temp = this.data[small];
        this.data[small] = this.data[i];
        this.data[i] = temp;
    }
    public static void main(String[] args) {
        Nama a = new Nama("Shinta, Oliv, Senja, Dani, Winda");
        a.PrintDataKendaraan();
    }

}
