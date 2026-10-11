.class Lax/d3/E$R;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/E;->L1(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/E;


# direct methods
.method constructor <init>(Lax/d3/E;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E$R;->a:Lax/d3/E;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .registers 8

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_14

    .line 7
    .line 8
    const/16 v0, 0x3b

    .line 9
    .line 10
    if-eq p2, v0, :cond_f

    .line 11
    .line 12
    const/16 v0, 0x3c

    .line 13
    .line 14
    if-ne p2, v0, :cond_14

    .line 15
    .line 16
    :cond_f
    iget-object v0, p0, Lax/d3/E$R;->a:Lax/d3/E;

    .line 17
    .line 18
    invoke-static {v0}, Lax/d3/E;->t5(Lax/d3/E;)V

    .line 19
    .line 20
    .line 21
    :cond_14
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v2, 0x0

    .line 26
    if-nez v0, :cond_b7

    .line 27
    .line 28
    const/16 v0, 0x3e

    .line 29
    .line 30
    const/4 v3, -0x1

    .line 31
    if-eq p2, v0, :cond_96

    .line 32
    .line 33
    const/16 v0, 0x42

    .line 34
    .line 35
    if-eq p2, v0, :cond_77

    .line 36
    .line 37
    const/16 v0, 0xa0

    .line 38
    .line 39
    if-eq p2, v0, :cond_77

    .line 40
    .line 41
    packed-switch p2, :pswitch_data_b8

    .line 42
    .line 43
    .line 44
    goto/16 :goto_b7

    .line 45
    .line 46
    :pswitch_2d
    instance-of v0, p1, Landroid/widget/GridView;

    .line 47
    .line 48
    if-eqz v0, :cond_45

    .line 49
    .line 50
    invoke-virtual {p3}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_45

    .line 55
    .line 56
    const/16 v0, 0x15

    .line 57
    .line 58
    if-ne p2, v0, :cond_3c

    .line 59
    .line 60
    const/4 v1, -0x1

    .line 61
    :cond_3c
    iget-object v0, p0, Lax/d3/E$R;->a:Lax/d3/E;

    .line 62
    .line 63
    check-cast p1, Landroid/widget/AbsListView;

    .line 64
    .line 65
    invoke-static {v0, p1, v1, p2, p3}, Lax/d3/E;->F5(Lax/d3/E;Landroid/widget/AbsListView;IILandroid/view/KeyEvent;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1

    .line 70
    :cond_45
    iget-object p1, p0, Lax/d3/E$R;->a:Lax/d3/E;

    .line 71
    .line 72
    invoke-static {p1}, Lax/d3/E;->t5(Lax/d3/E;)V

    .line 73
    .line 74
    .line 75
    goto :goto_b7

    .line 76
    :pswitch_4b
    invoke-virtual {p3}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_71

    .line 81
    .line 82
    const/16 v0, 0x13

    .line 83
    .line 84
    if-ne p2, v0, :cond_56

    .line 85
    .line 86
    goto :goto_57

    .line 87
    :cond_56
    const/4 v3, 0x1

    .line 88
    :goto_57
    instance-of v0, p1, Landroid/widget/GridView;

    .line 89
    .line 90
    if-eqz v0, :cond_66

    .line 91
    .line 92
    move-object v0, p1

    .line 93
    check-cast v0, Landroid/widget/GridView;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/widget/GridView;->getNumColumns()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    :cond_66
    iget-object v0, p0, Lax/d3/E$R;->a:Lax/d3/E;

    .line 104
    .line 105
    check-cast p1, Landroid/widget/AbsListView;

    .line 106
    .line 107
    mul-int v3, v3, v1

    .line 108
    .line 109
    invoke-static {v0, p1, v3, p2, p3}, Lax/d3/E;->F5(Lax/d3/E;Landroid/widget/AbsListView;IILandroid/view/KeyEvent;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    return p1

    .line 114
    :cond_71
    iget-object p1, p0, Lax/d3/E$R;->a:Lax/d3/E;

    .line 115
    .line 116
    invoke-static {p1}, Lax/d3/E;->t5(Lax/d3/E;)V

    .line 117
    .line 118
    .line 119
    goto :goto_b7

    .line 120
    :cond_77
    invoke-virtual {p3}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_b7

    .line 125
    .line 126
    iget-object p1, p0, Lax/d3/E$R;->a:Lax/d3/E;

    .line 127
    .line 128
    invoke-static {p1}, Lax/d3/E;->S5(Lax/d3/E;)Landroid/widget/AbsListView;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-eqz p1, :cond_95

    .line 133
    .line 134
    iget-object p1, p0, Lax/d3/E$R;->a:Lax/d3/E;

    .line 135
    .line 136
    invoke-static {p1}, Lax/d3/E;->b6(Lax/d3/E;)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-nez p1, :cond_95

    .line 141
    .line 142
    iget-object p1, p0, Lax/d3/E$R;->a:Lax/d3/E;

    .line 143
    .line 144
    const p2, 0x7f0a02dc

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, p2, v2, v1}, Lax/d3/E;->J7(IZZ)Z

    .line 148
    .line 149
    .line 150
    :cond_95
    return v1

    .line 151
    :cond_96
    iget-object p1, p0, Lax/d3/E$R;->a:Lax/d3/E;

    .line 152
    .line 153
    invoke-static {p1}, Lax/d3/E;->S5(Lax/d3/E;)Landroid/widget/AbsListView;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eq p1, v3, :cond_b6

    .line 162
    .line 163
    iget-object p2, p0, Lax/d3/E$R;->a:Lax/d3/E;

    .line 164
    .line 165
    invoke-static {p2}, Lax/d3/E;->S5(Lax/d3/E;)Landroid/widget/AbsListView;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    iget-object p3, p0, Lax/d3/E$R;->a:Lax/d3/E;

    .line 170
    .line 171
    invoke-static {p3}, Lax/d3/E;->S5(Lax/d3/E;)Landroid/widget/AbsListView;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    invoke-virtual {p3, p1}, Landroid/widget/AbsListView;->isItemChecked(I)Z

    .line 176
    .line 177
    .line 178
    move-result p3

    .line 179
    xor-int/2addr p3, v1

    .line 180
    invoke-virtual {p2, p1, p3}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 181
    .line 182
    .line 183
    :cond_b6
    return v1

    .line 184
    :cond_b7
    :goto_b7
    return v2

    .line 185
    :pswitch_data_b8
    .packed-switch 0x13
        :pswitch_4b
        :pswitch_4b
        :pswitch_2d
        :pswitch_2d
    .end packed-switch
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method
