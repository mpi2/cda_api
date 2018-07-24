package org.mousephenotype.cda.loader.models.solr;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.solr.client.solrj.beans.Field;
import org.mousephenotype.cda.loader.models.jpa.Allele;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;


@Data
@NoArgsConstructor
@SolrDocument(solrCoreName = "allele2")
public class AlleleLegacy {
    @Id
    @Field("allele_mgi_accession_id")
    private String docId;

    @Field("allele_symbol")
    private String alleleSymbol;

    @Field("mgi_accession_id")
    private String gacc;

    @Field("marker_symbol")
    private String geneSymbol;

    @Field("allele_image")
    private String alleleImage;

    @Field("mutation_type")
    private String alleleType;
}
