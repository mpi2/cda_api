package org.mousephenotype.cda.loader.models.solr;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.ArrayList;


@Data
@NoArgsConstructor
@SolrDocument(solrCoreName = "gene")
public class GeneLegacy {
    @Id
    @Field("mgi_accession_id")
    private String accessinId;

    @Field("marker_symbol")
    private String symbol;

    @Field("human_gene_symbol")
    private ArrayList<String> humanGeneSymbol;

    @Field("seq_region_start")
    private ArrayList<String> seqRegionStart;

    @Field("seq_region_end")
    private ArrayList<String> seqRegionEnd;


}
