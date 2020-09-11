//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.09.07 �s 01:25:49 PM BRT 
//


package br.com.octa.schema.nfse;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chnfse" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="munger" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nunfse" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="serienfse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dhemi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="naturezaoperacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regimeespecialtributacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optantesimples" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="competencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="discriminacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codverificacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codservnfse" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="codserv_codtrib_nfse" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="tomadorrazao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tomadorcnpj" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tomadorcpf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prestadorrazao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prestadorcnpj" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="prestadorcpf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prestadoruf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inscricao" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="valorservico" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="valordeducoes" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="valorpis" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="valorcofins" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="valorinss" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="valorir" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="valorcsll" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="issretido" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="valoriss" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="basecalculo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="aliquota" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="valorliquido" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="linha_oc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero_oc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tiponfe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="utilizacaofiscal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cfopentrada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xped" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nitemped" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valortotal" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="municipiogerador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="atividade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outrasinformacoes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dt_entrada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dt_entrada_reposit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="local_prestacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uf_prestacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rfe_item_nfse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="chnfse" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="nitem" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="codigo_servico" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="codigo_servico_cia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="descricao_servico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="qtd_item_servico" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="valor_unitario" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="valor_total" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="tributado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="xped" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nitemped" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="total_retencoes" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "chnfse",
    "munger",
    "nunfse",
    "serienfse",
    "tipo",
    "dhemi",
    "naturezaoperacao",
    "regimeespecialtributacao",
    "optantesimples",
    "competencia",
    "discriminacao",
    "codverificacao",
    "codservnfse",
    "codservCodtribNfse",
    "tomadorrazao",
    "tomadorcnpj",
    "tomadorcpf",
    "prestadorrazao",
    "prestadorcnpj",
    "prestadorcpf",
    "prestadoruf",
    "inscricao",
    "valorservico",
    "valordeducoes",
    "valorpis",
    "valorcofins",
    "valorinss",
    "valorir",
    "valorcsll",
    "issretido",
    "valoriss",
    "basecalculo",
    "aliquota",
    "valorliquido",
    "linhaOc",
    "numeroOc",
    "tiponfe",
    "utilizacaofiscal",
    "cfopentrada",
    "xped",
    "nitemped",
    "valortotal",
    "municipiogerador",
    "atividade",
    "outrasinformacoes",
    "dtEntrada",
    "dtEntradaReposit",
    "localPrestacao",
    "ufPrestacao",
    "rfeItemNfse",
    "totalRetencoes"
})
@XmlRootElement(name = "rfe_nfse")
public class RfeNfse {

    @XmlElement(required = true)
    protected BigInteger chnfse;
    @XmlElement(required = true)
    protected String munger;
    protected short nunfse;
    @XmlElement(required = true)
    protected String serienfse;
    @XmlElement(required = true)
    protected String tipo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhemi;
    @XmlElement(required = true)
    protected String naturezaoperacao;
    @XmlElement(required = true)
    protected String regimeespecialtributacao;
    @XmlElement(required = true)
    protected String optantesimples;
    protected int competencia;
    @XmlElement(required = true)
    protected String discriminacao;
    @XmlElement(required = true)
    protected String codverificacao;
    protected float codservnfse;
    @XmlElement(name = "codserv_codtrib_nfse")
    protected short codservCodtribNfse;
    @XmlElement(required = true)
    protected String tomadorrazao;
    protected long tomadorcnpj;
    @XmlElement(required = true)
    protected String tomadorcpf;
    @XmlElement(required = true)
    protected String prestadorrazao;
    protected long prestadorcnpj;
    @XmlElement(required = true)
    protected String prestadorcpf;
    @XmlElement(required = true)
    protected String prestadoruf;
    protected short inscricao;
    protected float valorservico;
    protected float valordeducoes;
    protected float valorpis;
    protected float valorcofins;
    protected float valorinss;
    protected float valorir;
    protected float valorcsll;
    protected float issretido;
    protected float valoriss;
    protected float basecalculo;
    protected float aliquota;
    protected float valorliquido;
    @XmlElement(name = "linha_oc", required = true)
    protected String linhaOc;
    @XmlElement(name = "numero_oc", required = true)
    protected String numeroOc;
    @XmlElement(required = true)
    protected String tiponfe;
    @XmlElement(required = true)
    protected String utilizacaofiscal;
    @XmlElement(required = true)
    protected String cfopentrada;
    @XmlElement(required = true)
    protected String xped;
    @XmlElement(required = true)
    protected String nitemped;
    protected float valortotal;
    @XmlElement(required = true)
    protected String municipiogerador;
    @XmlElement(required = true)
    protected String atividade;
    @XmlElement(required = true)
    protected String outrasinformacoes;
    @XmlElement(name = "dt_entrada", required = true)
    protected String dtEntrada;
    @XmlElement(name = "dt_entrada_reposit", required = true)
    protected String dtEntradaReposit;
    @XmlElement(name = "local_prestacao", required = true)
    protected String localPrestacao;
    @XmlElement(name = "uf_prestacao", required = true)
    protected String ufPrestacao;
    @XmlElement(name = "rfe_item_nfse", required = true)
    protected RfeNfse.RfeItemNfse rfeItemNfse;
    @XmlElement(name = "total_retencoes")
    protected float totalRetencoes;

    /**
     * Obt�m o valor da propriedade chnfse.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChnfse() {
        return chnfse;
    }

    /**
     * Define o valor da propriedade chnfse.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChnfse(BigInteger value) {
        this.chnfse = value;
    }

    /**
     * Obt�m o valor da propriedade munger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunger() {
        return munger;
    }

    /**
     * Define o valor da propriedade munger.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunger(String value) {
        this.munger = value;
    }

    /**
     * Obt�m o valor da propriedade nunfse.
     * 
     */
    public short getNunfse() {
        return nunfse;
    }

    /**
     * Define o valor da propriedade nunfse.
     * 
     */
    public void setNunfse(short value) {
        this.nunfse = value;
    }

    /**
     * Obt�m o valor da propriedade serienfse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerienfse() {
        return serienfse;
    }

    /**
     * Define o valor da propriedade serienfse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerienfse(String value) {
        this.serienfse = value;
    }

    /**
     * Obt�m o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obt�m o valor da propriedade dhemi.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDhemi() {
        return dhemi;
    }

    /**
     * Define o valor da propriedade dhemi.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDhemi(XMLGregorianCalendar value) {
        this.dhemi = value;
    }

    /**
     * Obt�m o valor da propriedade naturezaoperacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturezaoperacao() {
        return naturezaoperacao;
    }

    /**
     * Define o valor da propriedade naturezaoperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturezaoperacao(String value) {
        this.naturezaoperacao = value;
    }

    /**
     * Obt�m o valor da propriedade regimeespecialtributacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimeespecialtributacao() {
        return regimeespecialtributacao;
    }

    /**
     * Define o valor da propriedade regimeespecialtributacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimeespecialtributacao(String value) {
        this.regimeespecialtributacao = value;
    }

    /**
     * Obt�m o valor da propriedade optantesimples.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptantesimples() {
        return optantesimples;
    }

    /**
     * Define o valor da propriedade optantesimples.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptantesimples(String value) {
        this.optantesimples = value;
    }

    /**
     * Obt�m o valor da propriedade competencia.
     * 
     */
    public int getCompetencia() {
        return competencia;
    }

    /**
     * Define o valor da propriedade competencia.
     * 
     */
    public void setCompetencia(int value) {
        this.competencia = value;
    }

    /**
     * Obt�m o valor da propriedade discriminacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscriminacao() {
        return discriminacao;
    }

    /**
     * Define o valor da propriedade discriminacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscriminacao(String value) {
        this.discriminacao = value;
    }

    /**
     * Obt�m o valor da propriedade codverificacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodverificacao() {
        return codverificacao;
    }

    /**
     * Define o valor da propriedade codverificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodverificacao(String value) {
        this.codverificacao = value;
    }

    /**
     * Obt�m o valor da propriedade codservnfse.
     * 
     */
    public float getCodservnfse() {
        return codservnfse;
    }

    /**
     * Define o valor da propriedade codservnfse.
     * 
     */
    public void setCodservnfse(float value) {
        this.codservnfse = value;
    }

    /**
     * Obt�m o valor da propriedade codservCodtribNfse.
     * 
     */
    public short getCodservCodtribNfse() {
        return codservCodtribNfse;
    }

    /**
     * Define o valor da propriedade codservCodtribNfse.
     * 
     */
    public void setCodservCodtribNfse(short value) {
        this.codservCodtribNfse = value;
    }

    /**
     * Obt�m o valor da propriedade tomadorrazao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTomadorrazao() {
        return tomadorrazao;
    }

    /**
     * Define o valor da propriedade tomadorrazao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTomadorrazao(String value) {
        this.tomadorrazao = value;
    }

    /**
     * Obt�m o valor da propriedade tomadorcnpj.
     * 
     */
    public long getTomadorcnpj() {
        return tomadorcnpj;
    }

    /**
     * Define o valor da propriedade tomadorcnpj.
     * 
     */
    public void setTomadorcnpj(long value) {
        this.tomadorcnpj = value;
    }

    /**
     * Obt�m o valor da propriedade tomadorcpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTomadorcpf() {
        return tomadorcpf;
    }

    /**
     * Define o valor da propriedade tomadorcpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTomadorcpf(String value) {
        this.tomadorcpf = value;
    }

    /**
     * Obt�m o valor da propriedade prestadorrazao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrestadorrazao() {
        return prestadorrazao;
    }

    /**
     * Define o valor da propriedade prestadorrazao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrestadorrazao(String value) {
        this.prestadorrazao = value;
    }

    /**
     * Obt�m o valor da propriedade prestadorcnpj.
     * 
     */
    public long getPrestadorcnpj() {
        return prestadorcnpj;
    }

    /**
     * Define o valor da propriedade prestadorcnpj.
     * 
     */
    public void setPrestadorcnpj(long value) {
        this.prestadorcnpj = value;
    }

    /**
     * Obt�m o valor da propriedade prestadorcpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrestadorcpf() {
        return prestadorcpf;
    }

    /**
     * Define o valor da propriedade prestadorcpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrestadorcpf(String value) {
        this.prestadorcpf = value;
    }

    /**
     * Obt�m o valor da propriedade prestadoruf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrestadoruf() {
        return prestadoruf;
    }

    /**
     * Define o valor da propriedade prestadoruf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrestadoruf(String value) {
        this.prestadoruf = value;
    }

    /**
     * Obt�m o valor da propriedade inscricao.
     * 
     */
    public short getInscricao() {
        return inscricao;
    }

    /**
     * Define o valor da propriedade inscricao.
     * 
     */
    public void setInscricao(short value) {
        this.inscricao = value;
    }

    /**
     * Obt�m o valor da propriedade valorservico.
     * 
     */
    public float getValorservico() {
        return valorservico;
    }

    /**
     * Define o valor da propriedade valorservico.
     * 
     */
    public void setValorservico(float value) {
        this.valorservico = value;
    }

    /**
     * Obt�m o valor da propriedade valordeducoes.
     * 
     */
    public float getValordeducoes() {
        return valordeducoes;
    }

    /**
     * Define o valor da propriedade valordeducoes.
     * 
     */
    public void setValordeducoes(float value) {
        this.valordeducoes = value;
    }

    /**
     * Obt�m o valor da propriedade valorpis.
     * 
     */
    public float getValorpis() {
        return valorpis;
    }

    /**
     * Define o valor da propriedade valorpis.
     * 
     */
    public void setValorpis(float value) {
        this.valorpis = value;
    }

    /**
     * Obt�m o valor da propriedade valorcofins.
     * 
     */
    public float getValorcofins() {
        return valorcofins;
    }

    /**
     * Define o valor da propriedade valorcofins.
     * 
     */
    public void setValorcofins(float value) {
        this.valorcofins = value;
    }

    /**
     * Obt�m o valor da propriedade valorinss.
     * 
     */
    public float getValorinss() {
        return valorinss;
    }

    /**
     * Define o valor da propriedade valorinss.
     * 
     */
    public void setValorinss(float value) {
        this.valorinss = value;
    }

    /**
     * Obt�m o valor da propriedade valorir.
     * 
     */
    public float getValorir() {
        return valorir;
    }

    /**
     * Define o valor da propriedade valorir.
     * 
     */
    public void setValorir(float value) {
        this.valorir = value;
    }

    /**
     * Obt�m o valor da propriedade valorcsll.
     * 
     */
    public float getValorcsll() {
        return valorcsll;
    }

    /**
     * Define o valor da propriedade valorcsll.
     * 
     */
    public void setValorcsll(float value) {
        this.valorcsll = value;
    }

    /**
     * Obt�m o valor da propriedade issretido.
     * 
     */
    public float getIssretido() {
        return issretido;
    }

    /**
     * Define o valor da propriedade issretido.
     * 
     */
    public void setIssretido(float value) {
        this.issretido = value;
    }

    /**
     * Obt�m o valor da propriedade valoriss.
     * 
     */
    public float getValoriss() {
        return valoriss;
    }

    /**
     * Define o valor da propriedade valoriss.
     * 
     */
    public void setValoriss(float value) {
        this.valoriss = value;
    }

    /**
     * Obt�m o valor da propriedade basecalculo.
     * 
     */
    public float getBasecalculo() {
        return basecalculo;
    }

    /**
     * Define o valor da propriedade basecalculo.
     * 
     */
    public void setBasecalculo(float value) {
        this.basecalculo = value;
    }

    /**
     * Obt�m o valor da propriedade aliquota.
     * 
     */
    public float getAliquota() {
        return aliquota;
    }

    /**
     * Define o valor da propriedade aliquota.
     * 
     */
    public void setAliquota(float value) {
        this.aliquota = value;
    }

    /**
     * Obt�m o valor da propriedade valorliquido.
     * 
     */
    public float getValorliquido() {
        return valorliquido;
    }

    /**
     * Define o valor da propriedade valorliquido.
     * 
     */
    public void setValorliquido(float value) {
        this.valorliquido = value;
    }

    /**
     * Obt�m o valor da propriedade linhaOc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinhaOc() {
        return linhaOc;
    }

    /**
     * Define o valor da propriedade linhaOc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinhaOc(String value) {
        this.linhaOc = value;
    }

    /**
     * Obt�m o valor da propriedade numeroOc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroOc() {
        return numeroOc;
    }

    /**
     * Define o valor da propriedade numeroOc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroOc(String value) {
        this.numeroOc = value;
    }

    /**
     * Obt�m o valor da propriedade tiponfe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiponfe() {
        return tiponfe;
    }

    /**
     * Define o valor da propriedade tiponfe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiponfe(String value) {
        this.tiponfe = value;
    }

    /**
     * Obt�m o valor da propriedade utilizacaofiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtilizacaofiscal() {
        return utilizacaofiscal;
    }

    /**
     * Define o valor da propriedade utilizacaofiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtilizacaofiscal(String value) {
        this.utilizacaofiscal = value;
    }

    /**
     * Obt�m o valor da propriedade cfopentrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfopentrada() {
        return cfopentrada;
    }

    /**
     * Define o valor da propriedade cfopentrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfopentrada(String value) {
        this.cfopentrada = value;
    }

    /**
     * Obt�m o valor da propriedade xped.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXped() {
        return xped;
    }

    /**
     * Define o valor da propriedade xped.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXped(String value) {
        this.xped = value;
    }

    /**
     * Obt�m o valor da propriedade nitemped.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNitemped() {
        return nitemped;
    }

    /**
     * Define o valor da propriedade nitemped.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNitemped(String value) {
        this.nitemped = value;
    }

    /**
     * Obt�m o valor da propriedade valortotal.
     * 
     */
    public float getValortotal() {
        return valortotal;
    }

    /**
     * Define o valor da propriedade valortotal.
     * 
     */
    public void setValortotal(float value) {
        this.valortotal = value;
    }

    /**
     * Obt�m o valor da propriedade municipiogerador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipiogerador() {
        return municipiogerador;
    }

    /**
     * Define o valor da propriedade municipiogerador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipiogerador(String value) {
        this.municipiogerador = value;
    }

    /**
     * Obt�m o valor da propriedade atividade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtividade() {
        return atividade;
    }

    /**
     * Define o valor da propriedade atividade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtividade(String value) {
        this.atividade = value;
    }

    /**
     * Obt�m o valor da propriedade outrasinformacoes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutrasinformacoes() {
        return outrasinformacoes;
    }

    /**
     * Define o valor da propriedade outrasinformacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutrasinformacoes(String value) {
        this.outrasinformacoes = value;
    }

    /**
     * Obt�m o valor da propriedade dtEntrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtEntrada() {
        return dtEntrada;
    }

    /**
     * Define o valor da propriedade dtEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtEntrada(String value) {
        this.dtEntrada = value;
    }

    /**
     * Obt�m o valor da propriedade dtEntradaReposit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtEntradaReposit() {
        return dtEntradaReposit;
    }

    /**
     * Define o valor da propriedade dtEntradaReposit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtEntradaReposit(String value) {
        this.dtEntradaReposit = value;
    }

    /**
     * Obt�m o valor da propriedade localPrestacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPrestacao() {
        return localPrestacao;
    }

    /**
     * Define o valor da propriedade localPrestacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPrestacao(String value) {
        this.localPrestacao = value;
    }

    /**
     * Obt�m o valor da propriedade ufPrestacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfPrestacao() {
        return ufPrestacao;
    }

    /**
     * Define o valor da propriedade ufPrestacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfPrestacao(String value) {
        this.ufPrestacao = value;
    }

    /**
     * Obt�m o valor da propriedade rfeItemNfse.
     * 
     * @return
     *     possible object is
     *     {@link RfeNfse.RfeItemNfse }
     *     
     */
    public RfeNfse.RfeItemNfse getRfeItemNfse() {
        return rfeItemNfse;
    }

    /**
     * Define o valor da propriedade rfeItemNfse.
     * 
     * @param value
     *     allowed object is
     *     {@link RfeNfse.RfeItemNfse }
     *     
     */
    public void setRfeItemNfse(RfeNfse.RfeItemNfse value) {
        this.rfeItemNfse = value;
    }

    /**
     * Obt�m o valor da propriedade totalRetencoes.
     * 
     */
    public float getTotalRetencoes() {
        return totalRetencoes;
    }

    /**
     * Define o valor da propriedade totalRetencoes.
     * 
     */
    public void setTotalRetencoes(float value) {
        this.totalRetencoes = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="chnfse" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="nitem" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="codigo_servico" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="codigo_servico_cia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="descricao_servico" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="qtd_item_servico" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="valor_unitario" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="valor_total" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="tributado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="xped" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nitemped" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "chnfse",
        "nitem",
        "codigoServico",
        "codigoServicoCia",
        "descricaoServico",
        "qtdItemServico",
        "valorUnitario",
        "valorTotal",
        "tributado",
        "status",
        "xped",
        "nitemped"
    })
    public static class RfeItemNfse {

        @XmlElement(required = true)
        protected BigInteger chnfse;
        protected byte nitem;
        @XmlElement(name = "codigo_servico")
        protected float codigoServico;
        @XmlElement(name = "codigo_servico_cia", required = true)
        protected String codigoServicoCia;
        @XmlElement(name = "descricao_servico", required = true)
        protected String descricaoServico;
        @XmlElement(name = "qtd_item_servico")
        protected byte qtdItemServico;
        @XmlElement(name = "valor_unitario")
        protected float valorUnitario;
        @XmlElement(name = "valor_total")
        protected float valorTotal;
        @XmlElement(required = true)
        protected String tributado;
        protected byte status;
        @XmlElement(required = true)
        protected String xped;
        @XmlElement(required = true)
        protected String nitemped;

        /**
         * Obt�m o valor da propriedade chnfse.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getChnfse() {
            return chnfse;
        }

        /**
         * Define o valor da propriedade chnfse.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setChnfse(BigInteger value) {
            this.chnfse = value;
        }

        /**
         * Obt�m o valor da propriedade nitem.
         * 
         */
        public byte getNitem() {
            return nitem;
        }

        /**
         * Define o valor da propriedade nitem.
         * 
         */
        public void setNitem(byte value) {
            this.nitem = value;
        }

        /**
         * Obt�m o valor da propriedade codigoServico.
         * 
         */
        public float getCodigoServico() {
            return codigoServico;
        }

        /**
         * Define o valor da propriedade codigoServico.
         * 
         */
        public void setCodigoServico(float value) {
            this.codigoServico = value;
        }

        /**
         * Obt�m o valor da propriedade codigoServicoCia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoServicoCia() {
            return codigoServicoCia;
        }

        /**
         * Define o valor da propriedade codigoServicoCia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoServicoCia(String value) {
            this.codigoServicoCia = value;
        }

        /**
         * Obt�m o valor da propriedade descricaoServico.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescricaoServico() {
            return descricaoServico;
        }

        /**
         * Define o valor da propriedade descricaoServico.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescricaoServico(String value) {
            this.descricaoServico = value;
        }

        /**
         * Obt�m o valor da propriedade qtdItemServico.
         * 
         */
        public byte getQtdItemServico() {
            return qtdItemServico;
        }

        /**
         * Define o valor da propriedade qtdItemServico.
         * 
         */
        public void setQtdItemServico(byte value) {
            this.qtdItemServico = value;
        }

        /**
         * Obt�m o valor da propriedade valorUnitario.
         * 
         */
        public float getValorUnitario() {
            return valorUnitario;
        }

        /**
         * Define o valor da propriedade valorUnitario.
         * 
         */
        public void setValorUnitario(float value) {
            this.valorUnitario = value;
        }

        /**
         * Obt�m o valor da propriedade valorTotal.
         * 
         */
        public float getValorTotal() {
            return valorTotal;
        }

        /**
         * Define o valor da propriedade valorTotal.
         * 
         */
        public void setValorTotal(float value) {
            this.valorTotal = value;
        }

        /**
         * Obt�m o valor da propriedade tributado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTributado() {
            return tributado;
        }

        /**
         * Define o valor da propriedade tributado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTributado(String value) {
            this.tributado = value;
        }

        /**
         * Obt�m o valor da propriedade status.
         * 
         */
        public byte getStatus() {
            return status;
        }

        /**
         * Define o valor da propriedade status.
         * 
         */
        public void setStatus(byte value) {
            this.status = value;
        }

        /**
         * Obt�m o valor da propriedade xped.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXped() {
            return xped;
        }

        /**
         * Define o valor da propriedade xped.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXped(String value) {
            this.xped = value;
        }

        /**
         * Obt�m o valor da propriedade nitemped.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNitemped() {
            return nitemped;
        }

        /**
         * Define o valor da propriedade nitemped.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNitemped(String value) {
            this.nitemped = value;
        }

    }

}
