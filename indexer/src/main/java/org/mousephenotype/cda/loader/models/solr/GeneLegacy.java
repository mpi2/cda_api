package org.mousephenotype.cda.loader.models.solr;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.solr.client.solrj.beans.Field;
import org.mousephenotype.cda.loader.models.jpa.Gene;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@SolrDocument(solrCoreName = "gene")
public class GeneLegacy {
    @Id
    @Field("mgi_accession_id")
    private String accessionId;

    @Field("marker_symbol")
    private String symbol;

    @Field("marker_name")
    private String name;

    @Field("human_gene_symbol")
    private ArrayList<String> humanGeneSymbol;

    @Field("seq_region_start")
    private String seqRegionStart;

    @Field("seq_region_end")
    private String seqRegionEnd;

    @Field("marker_synonym")
    private List<String> synonyms;
}
