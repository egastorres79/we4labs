import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("38f25459-2b1f-43b0-ad23-0edfbc5185f3")
public class Cliente {
    @objid ("4bf75c9f-dea8-4c8d-9059-ed825f72b834")
    public List<Contato> contato = new ArrayList<Contato> ();

    @objid ("924c63fe-ee6c-4152-8a4d-139ab1b4ac70")
    public Endereco endereco;

}
