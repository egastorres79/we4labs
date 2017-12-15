import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6cd9f371-baf6-47e7-9db8-287743b55c1b")
public class Proposta {
    @objid ("4087c1c4-4cab-4187-9ab9-949e7453e307")
    private String numero;

    @objid ("62c5497c-e72f-4e74-9975-0267887d6042")
    private Integer versao;

    @objid ("809ec05e-1c4c-47e7-b366-d5f6bcfc1960")
    private Integer validadePropostaDias;

    @objid ("f7c8c893-4317-400c-9436-a4faf2028ad9")
    private Integer quotas;

    @objid ("9282763e-2c3b-4e56-88a2-f6525bc5850b")
    private Integer parcelas;

    @objid ("dca29804-9491-4d6d-a579-906f4a9f6d00")
    private Double frete;

    @objid ("bc8c1e2d-4993-423f-916a-4db7d5b4bdb7")
    private Double valor;

    @objid ("70acb8d2-4aa4-44a8-892a-19f846d6186c")
    private Double lucroLiquido;

    @objid ("0ba18232-4dcc-4b94-bbdf-8089c955a0f0")
    private Double lucroBruto;

    @objid ("bfcde470-1ad0-48dd-aecb-5974ccc6c08c")
    private String observacao;

    @objid ("3660e39f-ff60-4947-adfa-5eed7e7be3ce")
    private Calendar dataCriacao;

    @objid ("f3b44c19-c768-4587-a559-33a5a707719e")
    private Calendar validadeProposta;

    @objid ("3d48b15c-293b-4dd9-b144-3066653503bf")
    private Calendar dataPrimeiroVencimento;

    @objid ("63a6b592-6ff5-4c5c-b3a7-1be47028ba81")
    private Calendar dataUltimoEnvio;

    @objid ("03ad7c4f-4ec6-4281-ab62-c27a7c94f0a3")
    private Calendar dataFechamento;

    @objid ("e16f05e7-9b6a-4389-9c39-fc0f0e5649d3")
    public Usuario usuarioQueCriou;

    @objid ("5d394526-8b81-4ed0-b589-951e06e762cd")
    public Usuario responsavel;

    @objid ("0ea95151-1bb3-44f4-aebd-c5259af7294e")
    public Cliente cliente;

    @objid ("0eeee61f-b0ee-476c-a25d-7bba4a5898e3")
    public List<HistoricoEnvioProposta> historicoEnvioProposta = new ArrayList<HistoricoEnvioProposta> ();

    @objid ("30f02508-7425-4bd7-ab06-85411b5b6ba7")
    public TipoContrato tipoContrato;

    @objid ("a45105e4-8c0c-45bd-8991-e5f58bb6b9fa")
    public CondicaoPagamento condicaoPagamento;

    @objid ("2ba82221-9266-4e13-9440-c5954ba5c205")
    public ProdutoProposto produtoProposto;

    @objid ("5004a992-e0d2-4a62-8a81-51fc1a6219b2")
    public ServicoProposto servicoProposto;

    @objid ("b337d7c3-2a65-4527-a0db-6c175bd1dcce")
    public StatusProposta statusProposta;

    @objid ("b2ed26ad-70e6-49bb-a521-03adb36c7f4d")
    public Transportadora transportadora;

    @objid ("c45e1e94-dff8-4787-910f-698dbfc54340")
    public TipoEntrega tipoEntrega;

    @objid ("b088962e-c4fa-4129-a9d6-0b54b1ba9c6a")
    public OrdemServico ordemServico;

}
