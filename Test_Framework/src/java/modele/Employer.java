package modele;

import etu2069.framework.annotation.Url;
import etu2069.framework.*;
import etu2069.framework.annotation.Scope;
import java.sql.Date;

@Scope(value="Singleton")
public class Employer {
    int id;
    String nom;
    Date date;
    String[] diplome;
    int[] choix;
    FileUpload image;

    public Employer(){}

    public Employer(int id , String nom , Date date, String[] diplome){
        this.setId(id);
        this.setNom(nom);
        this.setDate(date);
        this.setDiplome(diplome);
    }

    @Url(lien="all_employer")
    public ModelView findAll(){
        String[] diplome = {"Licence","Bacc"};
        Employer[] list_emp = new Employer[3];
        list_emp[0] = new Employer(1,"Emp 1" , Date.valueOf("2000-01-01") , diplome);
        list_emp[1] = new Employer(2,"Emp 2" , Date.valueOf("2000-01-01") , diplome);
        list_emp[2] = new Employer(3,"Emp 3" , Date.valueOf("2000-01-01") , diplome);

        ModelView mv = new ModelView();
        mv.setView("listEmployer.jsp");
        mv.addItem("listes", list_emp);
        return mv;
    }

    @Url(lien="save_employer")
    public ModelView save(){
        ModelView mv = new ModelView();
        mv.setView("saveEmp.jsp");
        mv.addItem("employer",this);
        return mv;
    }
    
    @Url(lien="employer_by_Id")
    public ModelView getEmployerById(int id){
        String[] diplome = {"Licence","Bacc"};
        Employer[] list_emp = new Employer[3];
        list_emp[0] = new Employer(1,"Emp 1" , Date.valueOf("2000-01-01"),diplome);
        list_emp[1] = new Employer(2,"Emp 2" , Date.valueOf("2000-01-01"),diplome);
        list_emp[2] = new Employer(3,"Emp 3" , Date.valueOf("2000-01-01"),diplome);

        ModelView mv = new ModelView();
        mv.setView("info_employer.jsp");
        
        for(int i=0 ; i<list_emp.length ; i++){
            if(list_emp[i].getId()==id){
                mv.addItem("employer",list_emp[i]);
            }
        }
        
        return mv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDate(Date date){
        this.date = date;
    }
    public Date getDate(){
        return this.date;
    }

    public String[] getDiplome() {
        return diplome;
    }

    public void setDiplome(String[] diplome) {
        this.diplome = diplome;
    }

    public int[] getChoix() {
        return choix;
    }

    public void setChoix(int[] choix) {
        this.choix = choix;
    }

    public FileUpload getImage() {
        return image;
    }

    public void setImage(FileUpload image) {
        this.image = image;
    }
    
}
