.class public final synthetic Lax/L2/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/M2/c;

.field public final synthetic q:Lax/L2/B;


# direct methods
.method public synthetic constructor <init>(Lax/L2/B;Lax/M2/c;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/L2/A;->q:Lax/L2/B;

    iput-object p2, p0, Lax/L2/A;->c0:Lax/M2/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/L2/A;->q:Lax/L2/B;

    iget-object v1, p0, Lax/L2/A;->c0:Lax/M2/c;

    invoke-static {v0, v1}, Lax/L2/B;->a(Lax/L2/B;Lax/M2/c;)V

    return-void
.end method
