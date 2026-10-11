.class public final synthetic Lax/I2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/I2/h;

.field public final synthetic q:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lax/I2/h;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/I2/g;->q:Ljava/util/List;

    iput-object p2, p0, Lax/I2/g;->c0:Lax/I2/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/I2/g;->q:Ljava/util/List;

    iget-object v1, p0, Lax/I2/g;->c0:Lax/I2/h;

    invoke-static {v0, v1}, Lax/I2/h;->a(Ljava/util/List;Lax/I2/h;)V

    return-void
.end method
