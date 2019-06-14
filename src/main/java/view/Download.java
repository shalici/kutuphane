package view;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.io.InputStream;

@ManagedBean
public class Download {

    private StreamedContent file;

    public Download() {
        InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/resources/demo/images/boromir.jpg");
        file = new DefaultStreamedContent(stream, "image/jpg", "downloaded_boromir.jpg");
    }

    public StreamedContent getFile() {
        return file;
    }
}