package video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Video {

private String titulo;
    private String autor;
    private String url;
    private boolean activo;

    public Video(String titulo, String autor, String url, boolean activo) {
        this.titulo = titulo;
        this.autor = autor;
        this.url = url;
        this.activo = activo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getUrl() {
        return url;
    }

    public boolean isActivo() {
        return activo;
    }
 
public static void main(String[] args) {

List<Video> videos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el título del video (o 'fin' para terminar):");
            String titulo = scanner.nextLine();
            if (titulo.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.println("Ingrese el autor del video:");
            String autor = scanner.nextLine();

            System.out.println("Ingrese la URL del video:");
            String url = scanner.nextLine();

            System.out.println("Ingrese si el video está activo (true/false):");
            boolean activo = scanner.nextBoolean();
            scanner.nextLine();

            Video video = new Video(titulo, autor, url, activo);
            videos.add(video);
        }

        System.out.println("Lista de videos:");
        for (Video video : videos) {
            System.out.println("Título: " + video.getTitulo());
            System.out.println("Autor: " + video.getAutor());
            System.out.println("URL: " + video.getUrl());
            System.out.println("Activo: " + video.isActivo());
            System.out.println();
        }
    }
}
    
