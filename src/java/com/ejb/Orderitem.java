/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Student
 */
@Entity
@Table(name = "orderitem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderitem.findAll", query = "SELECT o FROM Orderitem o")
    , @NamedQuery(name = "Orderitem.findByOid", query = "SELECT o FROM Orderitem o WHERE o.oid = :oid")
    , @NamedQuery(name = "Orderitem.findByName", query = "SELECT o FROM Orderitem o WHERE o.name = :name")
    , @NamedQuery(name = "Orderitem.findByQyantity", query = "SELECT o FROM Orderitem o WHERE o.qyantity = :qyantity")
    , @NamedQuery(name = "Orderitem.findByComment", query = "SELECT o FROM Orderitem o WHERE o.comment = :comment")})
public class Orderitem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "OID")
    private String oid;
    @Size(max = 25)
    @Column(name = "NAME")
    private String name;
    @Column(name = "QYANTITY")
    private Integer qyantity;
    @Size(max = 150)
    @Column(name = "COMMENT")
    private String comment;

    public Orderitem() {
    }

    public Orderitem(String oid) {
        this.oid = oid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQyantity() {
        return qyantity;
    }

    public void setQyantity(Integer qyantity) {
        this.qyantity = qyantity;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oid != null ? oid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderitem)) {
            return false;
        }
        Orderitem other = (Orderitem) object;
        if ((this.oid == null && other.oid != null) || (this.oid != null && !this.oid.equals(other.oid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejb.Orderitem[ oid=" + oid + " ]";
    }

    int getQuantity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
