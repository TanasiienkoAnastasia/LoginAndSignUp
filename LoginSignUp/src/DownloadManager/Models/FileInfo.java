package DownloadManager.Models;


public class FileInfo {
    
    private int index;
    private String name;
    private String url;
    private String status;
    private String action;
    
    public FileInfo(int index, String name, String url, String status){
        this.index = index;
        this.name = name;
        this.url = url;
        this.status = status;
    }
    
    public int getIndex(){
        return index;
    }
    
    public void setIndex(int index){
        this.index = index;
    }
    
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getUrl(){
        return url;
    }
    
    public void setUrl(String url){
        this.url = url;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getAction(){
        return action;
    }
    
    public void setAction(String action){
        this.action = action;
    }
    
}
