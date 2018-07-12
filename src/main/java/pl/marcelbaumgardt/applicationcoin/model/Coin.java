package pl.marcelbaumgardt.applicationcoin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Coin {

    @Id
    @GeneratedValue
    private Long id;
    private Date time;
    private String asset_id_base;
    private String asset_id_quote;
    private Double rate;

}
