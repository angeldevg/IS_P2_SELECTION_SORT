package gt.edu.miumg.sistemas.ingesoftware.p2.SelectionSort;

import gt.edu.miumg.sistemas.ingesoftware.p2.SelectionSort.Services.IWordManager;
import gt.edu.miumg.sistemas.ingesoftware.p2.SelectionSort.Services.WordManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SelectionSortApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SelectionSortApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        IWordManager d = new WordManager ();
        
        d.ShowData();
     
        
       
        
    
    }

}
