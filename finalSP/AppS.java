package AdmSP;




import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AppS {



		    public static void clearTerminal(){
		        System.out.print("\033[H\033[2J");
		        System.out.flush();
		    }

		    public static void printSpootifyLogo(){
		        System.out.println("\u001B[32m\n               ⢀⣠⣤⣤⣶⣶⣶⣶⣤⣤⣄⡀\n            ⢀⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⡀\n        ⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦\n        ⠀⢀⣾⣿⡿⠿⠛⠛⠛⠉⠉⠉⠉⠛⠛⠛⠿⠿⣿⣿⣿⣿⣿⣷⡀\n        ⠀⣾⣿⣿⣇⠀⣀⣀⣠⣤⣤⣤⣤⣤⣀⣀⠀⠀⠀⠈⠙⠻⣿⣿⣷ \n        ⢠⣿⣿⣿⣿⡿⠿⠟⠛⠛⠛⠛⠛⠛⠻⠿⢿⣿⣶⣤⣀⣠⣿⣿⣿⡄\n        ⢸⣿⣿⣿⣿⣇⣀⣀⣤⣤⣤⣤⣤⣄⣀⣀⠀⠀⠉⠛⢿⣿⣿⣿⣿⡇  sPOOtify\n        ⠘⣿⣿⣿⣿⣿⠿⠿⠛⠛⠛⠛⠛⠛⠿⠿⣿⣶⣦⣤⣾⣿⣿⣿⣿⠃  by: @JP\n        ⠀⢿⣿⣿⣿⣿⣤⣤⣤⣤⣶⣶⣦⣤⣤⣄⡀⠈⠙⣿⣿⣿⣿⣿⡿\n        ⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣾⣿⣿⣿⣿⡿⠁\n        ⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟\n        ⠀⠀⠀⠀⠈⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠁\n        ⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠛⠿⠿⠿⠿⠛⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀\n\n");
		    }
		    
		    public static void pressEnter(Scanner dataScanner){
		        System.out.println("==================================================================================+++---");
		        System.out.println("Pressione 'ENTER' para ir al menu");
		        System.out.println("==================================================================================+++---");
		        dataScanner.nextLine();
		    }

		    public static void closeScanner(Scanner scanner){
		        scanner.close();
		    }

		    public static Music createMusic(Scanner dataScanner){
		        Scanner stringCutter;
		        String title;
		        int duration;
		        List<String> songwriters = new ArrayList<String>();
		        String bigSW;
		        List<String> interpreters = new ArrayList<String>();
		        String bigIT;
		        String genre;
		        
		        System.out.println("Titulo:");
		        title = dataScanner.nextLine();

		        System.out.println("Duracion:");
		        duration = dataScanner.nextInt();
		        dataScanner.nextLine();
		        
		        System.out.println("Genero:");
		        genre = dataScanner.nextLine();

		        System.out.println("Compositores: Separe con ;");
		        bigSW = dataScanner.nextLine();

		        System.out.println("Interpretes: Separe con ;");
		        bigIT = dataScanner.nextLine();

		        stringCutter = new Scanner(bigSW);
		        stringCutter.useDelimiter(";");

		        while(stringCutter.hasNext()){
		            songwriters.add(stringCutter.next());
		        }
		        stringCutter.close();

		        stringCutter = new Scanner(bigIT);
		        stringCutter.useDelimiter(";");

		        while(stringCutter.hasNext()){
		            interpreters.add(stringCutter.next());
		        }
		        stringCutter.close();

		        return new Music(title, duration, songwriters, interpreters, genre);
		    }

		    public static Podcast createPodcast(Scanner dataScanner){
		        String title;
		        int duration;
		        String presenter;
		        String review;
		        
		        System.out.println("Titulo:");
		        title = dataScanner.nextLine();

		        System.out.println("Duracion:");
		        duration = dataScanner.nextInt();
		        dataScanner.nextLine();
		        
		        System.out.println("Apresentador:");
		        presenter = dataScanner.nextLine();

		        System.out.println("Descripcion:");
		        review = dataScanner.nextLine();

		        return new Podcast(title, duration, presenter, review);
		    }

		    public static Audiobook createAudioook(Scanner dataScanner){
		        Scanner stringCutter;
		        String title;
		        int duration;
		        List<String> authors = new ArrayList<String>();
		        String bigAT;
		        String storyteller;
		        String publisher;
		        String synopsis;
		        
		        System.out.println("Titulo:");
		        title = dataScanner.nextLine();;

		        System.out.println("Duracion:");
		        duration = dataScanner.nextInt();
		        dataScanner.nextLine();
		        
		        System.out.println("Editora:");
		        publisher = dataScanner.nextLine();

		        System.out.println("Autores: Separe com ;");
		        bigAT = dataScanner.nextLine();

		        System.out.println("Interprete:");
		        storyteller = dataScanner.nextLine();

		        System.out.println("Sinopse:");
		        synopsis = dataScanner.nextLine();

		        stringCutter = new Scanner(bigAT);
		        stringCutter.useDelimiter(";");

		        while(stringCutter.hasNext()){
		            authors.add(stringCutter.next());
		        }
		        stringCutter.close();

		        return new Audiobook(title, duration, authors, synopsis, storyteller, publisher);
		    }

		    public static void addToPlaylist(Scanner dataScanner, String playlistTitle, MenuP menu){
		        boolean wannaAdd = true;
		        int actualCommand;
		        while(wannaAdd){
		            clearTerminal();
		            printSpootifyLogo();
		            System.out.println("Que tipo de contenido quiere adicionar?");
		            System.out.println("==================================================================================+++---");
		            System.out.println("1. Música | 2. Podcast | 3. Audiobook");
		            actualCommand = dataScanner.nextInt();
		            dataScanner.nextLine();
		            
		            switch (actualCommand) {
		                case 1:
		                    try{
		                        menu.getPlayList(playlistTitle).addContent(createMusic(dataScanner));
		                        System.out.println("Música adicionada con exito!");
		                    }catch(InputMismatchException e){
		                        clearTerminal();
		                        System.out.println("Entrada inválida!!\nPressione ENTER para continuar");
		                        dataScanner.nextLine();
		                        clearTerminal();
		                    }
		                    break;
		                    
		                
		                case 2:
		                    try{
		                        menu.getPlayList(playlistTitle).addContent(createPodcast(dataScanner));
		                        System.out.println("Podcast adicionado con exito!");
		                    }catch(InputMismatchException e){
		                        clearTerminal();
		                        System.out.println("Entrada inválida!\nPressione ENTER para continuar");
		                        dataScanner.nextLine();
		                        clearTerminal();   
		                    }
		                    break;
		                
		                case 3:
		                    try{
		                        menu.getPlayList(playlistTitle).addContent(createAudioook(dataScanner));
		                        System.out.println("Audiobook Exito!");
		                    }catch(InputMismatchException e){
		                        clearTerminal();
		                        System.out.println("Entrada inválida!\nPressione ENTER para continuar");
		                        dataScanner.nextLine();
		                        clearTerminal();
		                    }
		                    break;
		                }
		                
		            System.out.println("==================================================================================+++---");
		            System.out.println(" adicionar mas contenido?");
		            System.out.println("==================================================================================+++---");
		            System.out.println("1. Si | 2. Volver al Menu");
		            actualCommand = dataScanner.nextInt();
		            dataScanner.nextLine();
		            if(actualCommand != 1) wannaAdd = false;
		        }
		    }

		    public static void showPlaylistContent(Scanner dataScanner, String playlistTitle, MenuP menu){
		        List<Content> filteredList = new ArrayList<Content>();
		        int actualCommand;
		        int counter;

		        clearTerminal();
		        System.out.println("Listar?");
		        System.out.println("==================================================================================+++---");
		        System.out.println("1. Músicas | 2. Podcasts | 3. Audiobooks | 4. Todos");
		        System.out.println("==================================================================================+++---");
		        actualCommand = dataScanner.nextInt();
		        dataScanner.nextLine();

		        switch(actualCommand){
		            case 1:
		                filteredList = menu.getPlayList(playlistTitle).filterBy(true, false, false);
		                break;
		            case 2:
		                filteredList = menu.getPlayList(playlistTitle).filterBy(false, true, true);
		                break;
		            case 3:
		                filteredList = menu.getPlayList(playlistTitle).filterBy(false, false, true);
		                break;
		            case 4:
		                filteredList = menu.getPlayList(playlistTitle).getContentList();
		                break;
		        }

		        counter = 1;

		        clearTerminal();
		        if(!filteredList.isEmpty()){
		            System.out.println("==================================================================================+++---");
		            System.out.println("Sus contenidos");
		            System.out.println("==================================================================================+++---");
		            for (Content spootifyContent : filteredList){
		                System.out.printf("%d | %s\n", counter, spootifyContent.toString());
		                counter += 1;
		            }
		        }else{
		            System.out.println("No existem contenidos :(");
		        }
		        pressEnter(dataScanner);

		    }

		    public static void createPlaylist(Scanner dataScanner, MenuP menu){
		        String playlistTitle;

		        printSpootifyLogo();
		        System.out.println("==================================================================================+++---");
		        System.out.println(" Crear Playlist");
		        System.out.println("==================================================================================+++---");
		        playlistTitle = dataScanner.nextLine();
		        
		        if(!menu.playlistExists(playlistTitle)){
		            menu.addPlaylist(playlistTitle);
		            System.out.println(" Playlist " + playlistTitle + " creada con exito!\n ");
		        } else{
		            System.out.println("Ya existe la playlist " + playlistTitle + "!");
		        }

		        pressEnter(dataScanner);
		    }
		    
		    public static void deletePlaylist(Scanner dataScanner, MenuP menu){
		        String playlistTitle;

		        printSpootifyLogo();
		        System.out.println("==================================================================================+++---");
		        System.out.println("Digite nombre playlist");
		        System.out.println("==================================================================================+++---");
		        playlistTitle = dataScanner.nextLine();
		        
		        if(menu.playlistExists(playlistTitle) && playlistTitle != "library"){
		            menu.removePlaylist(playlistTitle);
		            System.out.println("Playlist " + playlistTitle + " !\n ");
		        } else if(playlistTitle == "library")
		            System.out.println("No es posible agregar biblioteca!");
		        else
		            System.out.println("No existe la playlist  " + playlistTitle + "!");

		        pressEnter(dataScanner);
		    }

		    public static void showPlaylists(Scanner dataScanner, MenuP menu){
		        int counter =1;
		        
		        if(menu.getPlaylist().size() > 1){
		            System.out.println("==================================================================================+++---");
		            System.out.println("Estas son tus playlists");
		            System.out.println("==================================================================================+++---");


		            for(String playlistTitle : menu.getPlaylist().keySet()){
		                if(playlistTitle != "library"){
		                    System.out.printf("%d | %s\n", counter, playlistTitle);
		                    counter += 1;
		                }
		            }
		        }else{
		            System.out.println("No tienes playlists :(");
		        }

		        pressEnter(dataScanner);
		    }

		    public static void main(String[] args){
		        MenuP myMenu = new MenuP();
		        Scanner dataScanner = new Scanner(System.in);
		        int actualCommand = 0;
		        String playlistTitle;

		        // Criando playlist com dados do usuário
		        clearTerminal();
		        printSpootifyLogo();
		        System.out.println("Welcome  sPOOtify!\n");
		        pressEnter(dataScanner);

		        while(actualCommand != 8){
		            clearTerminal();
		            printSpootifyLogo();
		            System.out.println("Selecion una opcion");
		            System.out.println("==================================================================================+++---");
		            System.out.println("1. Cargar su Biblioteca               | 2. Bilioteca\n3. Info Biblioteca            | 4. Crear  Playlist");
		            System.out.println("5. Elimiinar Playlist                 | 6. Add contenido Playlist\n  7. Listar Playlists        | 8. Salir");
		            System.out.println("==================================================================================+++---");
		            actualCommand = dataScanner.nextInt();
		            dataScanner.nextLine();

		            clearTerminal();
		            printSpootifyLogo();

		            switch(actualCommand){
		                // Adicionar Contenido a biblioteca
		                case 1:
		                    addToPlaylist(dataScanner, "library", myMenu);
		                    break;

		                // Listar Contenidos da biblioteca
		                case 2:
		                    showPlaylistContent(dataScanner, "library", myMenu);
		                    break;

		                // Mostrar biblioteca
		                case 3:
		                    System.out.println(myMenu.getPlayList("library").getDescription());
		                    pressEnter(dataScanner);
		                    break;
		                
		                // Crear Nueva playlist
		                case 4:
		                    try{
		                        createPlaylist(dataScanner, myMenu);
		                    }catch(InputMismatchException e){
		                        System.out.println("Entrada inválida!\nNão foi possível adicionar o conteúdo!\nPressione ENTER para continuar");
		                        dataScanner.nextLine();
		                        clearTerminal();
		                    }
		                    break;
		                
		                
		                case 5:
		                    deletePlaylist(dataScanner, myMenu);
		                    break;
		                
		                // Adicionar a uma playlist
		                case 6:
		                    System.out.println("==================================================================================+++---");
		                    System.out.println("Digite el nombre de la playlist");
		                    System.out.println("==================================================================================+++---");
		                    playlistTitle = dataScanner.nextLine();
		                    if(myMenu.playlistExists(playlistTitle)) addToPlaylist(dataScanner, playlistTitle, myMenu);
		                    else{
		                    	
		                        System.out.println("Esa playlist no existe!");
		                        pressEnter(dataScanner);
		                        clearTerminal();
		                    }
		                    break;

		                // Listando playlists
		                case 7:
		                    showPlaylists(dataScanner, myMenu);
		                    break;

		                // Sair
		                case 8:
		                    System.out.println("Saliendo...");
		                    break;
		            }
		        }
		        closeScanner(dataScanner);
		    }
		}
		
