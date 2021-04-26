package gt.edu.miumg.sistemas.ingesoftware.p2.SelectionSort.Services;

public class WordManager implements IWordManager{
    
    public static String [] InsertNaruto (){
        
    
        ISelectionSort data = new SelectionSort();
        
        String nameNaruto[] = {"sasuke","naruto","gaara","itachi"};
        
        data.SortBySelection(nameNaruto);
        
        return nameNaruto;
        
    
    }

    @Override
    public void ShowData() {
        
       String m [] = InsertNaruto ();
       for (int n = 0; n<m.length;n++){
           System.out.println(m [n]); 
       }
       }
       
       
}