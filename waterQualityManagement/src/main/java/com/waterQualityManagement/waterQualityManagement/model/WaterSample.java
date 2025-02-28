package com.waterQualityManagement.waterQualityManagement.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor  // ✅ Required for MongoDB deserialization
@AllArgsConstructor
@Document(collection = "water_samples")
public class WaterSample {

    @Id
    private String id;

    @Field("PHpH") // ✅ Matches field in database
    private double pH;

    @Field("ALK_MGL") // ✅ Matches field in database
    private double alkalinity;

    @Field("COND_USCM") // ✅ Matches field in database
    private double conductivity;

    @Field("BOD_MGL") // ✅ Matches field in database
    private double bod;

    @Field("NO2_N_MGL") // ✅ Matches field in database
    private double nitrate;

    @Field("CUSOL1_MGL") // ✅ Matches field in database
    private double copperSol1;

    @Field("CUSOL2_UGL") // ✅ Matches field in database
    private double copperSol2;

    @Field("FESOL1_UGL") // ✅ Matches field in database
    private double ironSol;

    @Field("ZN_SOL_UGL") // ✅ Matches field in database
    private double zincSol;
}
